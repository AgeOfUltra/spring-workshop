package com.bookapp.bookappjpa.repository;

import com.bookapp.bookappjpa.model.Book;
import com.bookapp.bookappjpa.model.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {

//    @Transactional
//    @Modifying
//    @Query("""
//        update Book b set b.title = :#{#bookDto.title},
//                         b.author = :#{#bookDto.author},
//                         b.price = :#{#bookDto.price},
//                         b.category = :#{#bookDto.category}
//        where b.id = :#{#bookDto.id}""")
//    void updateByBookDto(Book bookDto);

    @Query("SELECT b FROM Book b WHERE b.author = :author")
    List<Book> findByAuthor(@Param("author") String author);
}
