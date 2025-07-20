package com.bookapp.bookappjpa;

import com.bookapp.bookappjpa.model.BookDto;
import com.bookapp.bookappjpa.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookAppJpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookAppJpaApplication.class, args);
    }
    @Autowired
    private IBookService bookService;

    @Override
    public void run(String... args) throws Exception {
//        BookDto bookDto = new BookDto("Java","kathy",null,200.0,"Tech");
//        BookDto bookDto1 = new BookDto("Java2","kathy2",null,200.0,"Tech2");
//        BookDto bookDto2 = new BookDto("Java3","kathy2",null,200.0,"Tech2");
//        BookDto bookDto3 = new BookDto("Java4","kathy2",null,200.0,"Tech2");
//        bookService.saveBook(bookDto);
//        bookService.saveBook(bookDto1);
//        bookService.saveBook(bookDto2);
//        bookService.saveBook(bookDto3);


        System.out.println(bookService.getBookById(2));
        bookService.getBooksByAuthor("kathy").forEach(System.out::println);

        BookDto bookDto = bookService.getBookById(2);
        bookDto.setAuthor("Srikanth");
        bookDto.setPrice(3000.0);
        bookDto.setTitle("How to find a! what ?");

        bookService.updateBook(bookDto);
        bookService.findAllBooks().forEach(System.out::println);

    }
}
