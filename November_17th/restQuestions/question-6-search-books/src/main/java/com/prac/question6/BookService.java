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
        // TODO: validate title, call the repository, and throw the correct exceptions
        return List.of();
    }
}
