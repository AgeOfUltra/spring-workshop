package com.bookapp.restapi.controllers;

import com.bookapp.restapi.model.BookDto;
import com.bookapp.restapi.model.BookNotFoundExceptions;
import com.bookapp.restapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    IBookService bookService;

    @PostMapping("/books")
    ResponseEntity<Void> saveBook(@RequestBody BookDto book){
        bookService.saveBook(book);

        return ResponseEntity.status(201).build();
    }
    @PutMapping("/books")
    ResponseEntity<Void> updateBook(@RequestBody  BookDto book){
        bookService.updateBook(book);
        return  ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @DeleteMapping("/books/delete/bookId/{id}")
    ResponseEntity<Void> deleteBook(@PathVariable  int id){
        bookService.deleteBook(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/books")
    ResponseEntity<List<BookDto>> findAllBooks(){

        List<BookDto> bookDtoList = bookService.findAllBooks();
        return ResponseEntity.ok().body(bookDtoList);
    }

    @GetMapping("/books/bookId/{id}")
    ResponseEntity<BookDto> getBookById(@PathVariable int id){

        BookDto bookDto = bookService.getBookById(id);
        return ResponseEntity.ok().body(bookDto);
    }

    @GetMapping("/books/author/{author}")
    ResponseEntity<List<BookDto>> getBooksByAuthor(@PathVariable  String author){
        List<BookDto> bookDtoList = bookService.getBooksByAuthor(author);
        return ResponseEntity.ok().body(bookDtoList);
    }

}
