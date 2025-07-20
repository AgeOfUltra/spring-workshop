package com.bookapp.bookappjpa.model;

public class BookNotFoundExceptions extends RuntimeException {
    public BookNotFoundExceptions() {
        super();
    }

    public BookNotFoundExceptions(String message) {
        super(message);
    }
}
