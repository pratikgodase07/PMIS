# Solution 6 - Search books with layers and error handling

## Files involved

The candidate completes these four files:

```text
question-6-search-books/
└── src/main/java/com/prac/question6/
    ├── BookRepository.java
    ├── BookService.java
    ├── BookController.java
    └── BookExceptionHandler.java
```

The `Book` record, `BookData`, `BookNotFoundException`, and `Question6Application` are supplied boilerplate. The request travels through four layers:

```text
HTTP request
    -> BookController
    -> BookService
    -> BookRepository
    -> BookData
```

Exceptions travel in the opposite direction and are converted into HTTP responses by `BookExceptionHandler`.

## 1. Repository

Open `src/main/java/com/prac/question6/BookRepository.java`. The repository is responsible only for reading and filtering the data. Use `startsWith` for prefix matching, `equalsIgnoreCase` behavior by converting both values to lower case, and ignore the author filter when it is absent or blank.

```java
package com.prac.question6;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public class BookRepository {

    public List<Book> findByTitleAndAuthor(String title, String author) {
        String titlePrefix = title.toLowerCase(Locale.ROOT);
        String authorPrefix = author == null ? null : author.toLowerCase(Locale.ROOT);

        return BookData.books().stream()
                .filter(book -> book.title().toLowerCase(Locale.ROOT).startsWith(titlePrefix))
                .filter(book -> authorPrefix == null
                        || authorPrefix.isBlank()
                        || book.author().toLowerCase(Locale.ROOT).startsWith(authorPrefix))
                .toList();
    }
}
```

`Locale.ROOT` makes the case conversion predictable and independent of the computer's regional settings. The repository does not validate the required title or decide HTTP status codes; those are service and controller concerns.

## 2. Service

Open `src/main/java/com/prac/question6/BookService.java`. The service validates the required business input, delegates to the repository, and converts an empty result into the supplied domain exception.

```java
package com.prac.question6;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> search(String title, String author) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be blank");
        }

        List<Book> books = bookRepository.findByTitleAndAuthor(title.trim(), author);
        if (books.isEmpty()) {
            throw new BookNotFoundException("No books found");
        }
        return books;
    }
}
```

`isBlank()` handles both an empty string and whitespace-only input. The service trims the title before searching so accidental surrounding spaces do not prevent a valid match. It throws `IllegalArgumentException` for invalid input and `BookNotFoundException` for a valid search with no results.

## 3. Controller

Open `src/main/java/com/prac/question6/BookController.java`. The controller maps the URL and delegates the actual work to the service.

```java
package com.prac.question6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public List<Book> searchBooks(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String author) {
        return bookService.search(title, author);
    }
}
```

Both parameters are optional at the Spring binding layer so that a missing `title` reaches the service and receives the same clear validation message as a blank title. The service validates the required business input. Returning a list produces `200 OK` and JSON when the search succeeds.

## 4. Exception handler

Open `src/main/java/com/prac/question6/BookExceptionHandler.java`. `@RestControllerAdvice` applies these handlers to controller exceptions and serializes the returned `String` as the response body.

```java
package com.prac.question6;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBadRequest(IllegalArgumentException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleNotFound(BookNotFoundException exception) {
        return ResponseEntity.status(404).body(exception.getMessage());
    }
}
```

The exception-specific handlers keep HTTP concerns out of the service. Returning the message in the body makes errors visible in Postman and matches the question contract.

## Run the application

Use the existing Maven project setup and run:

```text
Question6Application
```

The server starts on port `8080`.

## Postman tests

### Search by title

```text
GET http://localhost:8080/api/books/search?title=spring
```

Expected status: `200 OK`

Expected response:

```json
[
  {
    "id": 1,
    "title": "Spring in Action",
    "author": "Craig Walls",
    "genre": "Technology"
  },
  {
    "id": 2,
    "title": "Spring Boot Up and Running",
    "author": "Mark Heckler",
    "genre": "Technology"
  }
]
```

### Search by title and author

```text
GET http://localhost:8080/api/books/search?title=effective&author=joshua
```

Expected status: `200 OK`, with `Effective Java` as the only result.

### Blank title

```text
GET http://localhost:8080/api/books/search?title=
```

Expected status: `400 Bad Request`

```text
title must not be blank
```

### No matching book

```text
GET http://localhost:8080/api/books/search?title=unknown
```

Expected status: `404 Not Found`

```text
No books found
```
