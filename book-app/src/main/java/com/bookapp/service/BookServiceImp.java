package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundExceptions;
import com.bookapp.utils.BookUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BookServiceImp implements IBookService{

    @Autowired
    private BookUtils utils;


    @Override
    public List<Book> getAllBooks() {
        return utils.displayBooks();
    }

    @Override
    public Book getBookById(int id) {

        return utils.displayBooks().stream().filter(b -> b.getId()== id).findFirst().orElseThrow(() -> {

            throw  new BookNotFoundExceptions("Book with id " + id + " not found");
        });
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        List<Book> books =  utils.displayBooks().stream().filter(b-> b.getAuthor().equals(author)).collect(Collectors.toList());
        if(books.isEmpty()){
            throw  new BookNotFoundExceptions("Book with author " + author + " not found");
        }

        return books;

    }
}
