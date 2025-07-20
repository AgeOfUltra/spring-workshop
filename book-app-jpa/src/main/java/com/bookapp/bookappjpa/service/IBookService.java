package com.bookapp.bookappjpa.service;

import com.bookapp.bookappjpa.model.Book;
import com.bookapp.bookappjpa.model.BookDto;
import com.bookapp.bookappjpa.model.BookNotFoundExceptions;

import java.util.List;

public interface IBookService {

    //CRUD OPERATIONS

    void saveBook(BookDto book);
    void updateBook(BookDto book);
    void deleteBook(int bookId);
    List<BookDto> findAllBooks();

    BookDto getBookById(int id) throws BookNotFoundExceptions;
    List<BookDto> getBooksByAuthor(String author) throws BookNotFoundExceptions;
}
