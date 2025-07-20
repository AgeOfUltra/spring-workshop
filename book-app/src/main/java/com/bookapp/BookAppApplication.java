package com.bookapp;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundExceptions;
import com.bookapp.service.BookServiceImp;
import com.bookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication()
public class BookAppApplication implements CommandLineRunner {

    @Autowired
    private IBookService bookServiceImp;

    public static void main(String[] args) {
        SpringApplication.run(BookAppApplication.class, args);

    }


    @Override
    public void run(String... args) {

        System.out.println("List of all books");
        bookServiceImp.getAllBooks().forEach(System.out::println);

        System.out.println("List of all books by author");
        try {
            bookServiceImp.getBooksByAuthor("Hero").forEach(System.out::println);
        }catch (BookNotFoundExceptions e){
            System.out.println(e.getMessage());
        }

        System.out.println("specific book request");
        try {
            Book book = bookServiceImp.getBookById(20);
            System.out.println(book.toString());
        }catch (BookNotFoundExceptions e){
            System.out.println(e.getMessage());
        }

    }
}
