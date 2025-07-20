package com.bookapp.restapi.service;

import com.bookapp.restapi.model.Book;
import com.bookapp.restapi.model.BookDto;
import com.bookapp.restapi.model.BookNotFoundExceptions;
import com.bookapp.restapi.repository.IBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImp implements IBookService{

    private IBookRepository repo;

    @Autowired
    private ModelMapper  mapper;

    @Autowired
    public BookServiceImp(IBookRepository repo) {
        super();
        this.repo = repo;
    }

    @Override
    public void saveBook(BookDto book) {
        Book bookEntity =mapper.map(book, Book.class);
        repo.save(bookEntity);

    }

    @Override
    public void updateBook(BookDto book) {
        repo.save(mapper.map(book, Book.class));

    }

    @Override
    public void deleteBook(int bookId) {
        repo.deleteById(bookId);
    }

    @Override
    public List<BookDto> findAllBooks() {
        List<Book> bookList =  repo.findAll();
        // converting Book entity to BookDto
        return bookList.stream().map(b-> mapper.map(b,BookDto.class)).toList();
    }

    @Override
    public BookDto getBookById(int id) throws BookNotFoundExceptions {

        Optional<Book> book = Optional.ofNullable(repo.findById(id).orElseThrow(() -> new BookNotFoundExceptions("Invalid book")));
        return mapper.map(book,BookDto.class);
    }

    @Override
    public List<BookDto> getBooksByAuthor(String author) throws BookNotFoundExceptions {

        List<Book> bookEntities =  repo.findByAuthor(author);
        return bookEntities.stream().map(e-> mapper.map(e,BookDto.class)).toList();

    }
}
