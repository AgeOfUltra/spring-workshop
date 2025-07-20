package com.bookapp.restapi.model;

public class BookNotFoundExceptions extends RuntimeException {
    public BookNotFoundExceptions() {
        super();
    }

    public BookNotFoundExceptions(String message) {
        super(message);
    }
}
