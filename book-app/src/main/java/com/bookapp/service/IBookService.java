package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundExceptions;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    Book getBookById(int id) throws BookNotFoundExceptions;
    List<Book> getBooksByAuthor(String author) throws BookNotFoundExceptions;
}
