package com.prac.question6;

import java.util.List;

final class BookData {

    private BookData() {
    }

    static List<Book> books() {
        return List.of(
                new Book(1, "Spring in Action", "Craig Walls", "Technology"),
                new Book(2, "Spring Boot Up and Running", "Mark Heckler", "Technology"),
                new Book(3, "Effective Java", "Joshua Bloch", "Programming"),
                new Book(4, "Clean Code", "Robert Martin", "Programming")
        );
    }
}
