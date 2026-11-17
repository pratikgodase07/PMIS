# Question 6 - Search books with layers and error handling

## Difficulty

Intermediate

## Task

Build a layered REST API for searching books.

Implement `GET /api/books/search` with the following behavior:

1. The required `title` query parameter is matched case-insensitively against the beginning of a book title.
2. The optional `author` query parameter is matched case-insensitively against the beginning of an author's name.
3. If both parameters are supplied, a book must match both filters.
4. Return matching books as a JSON array with `200 OK`.
5. Return `400 Bad Request` with the message `title must not be blank` when `title` is missing or blank.
6. Return `404 Not Found` with the message `No books found` when the request is valid but no books match.

Use the supplied in-memory data. Do not add a database.

## Files to complete

You must write code in these four files:

```text
src/main/java/com/prac/question6/BookRepository.java
src/main/java/com/prac/question6/BookService.java
src/main/java/com/prac/question6/BookController.java
src/main/java/com/prac/question6/BookExceptionHandler.java
```

The `Book` record, `Question6Application`, and sample data are already provided. Keep the endpoint path unchanged and preserve the separation between controller, service, repository, and exception handling.

## Examples

### Search by title

```text
GET /api/books/search?title=spring
```

Returns `200 OK` with books whose titles begin with `Spring`.

### Search by title and author

```text
GET /api/books/search?title=effective&author=joshua
```

Returns only books matching both filters.

### Invalid request

```text
GET /api/books/search?title=
```

Returns `400 Bad Request`:

```text
title must not be blank
```

### No result

```text
GET /api/books/search?title=unknown
```

Returns `404 Not Found`:

```text
No books found
```
