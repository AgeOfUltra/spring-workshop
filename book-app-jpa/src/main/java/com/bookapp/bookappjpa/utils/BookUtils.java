package com.bookapp.bookappjpa.utils;

import com.bookapp.bookappjpa.model.Book;
import com.bookapp.bookappjpa.model.BookDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookUtils {

    public List<BookDto> displayBooks(){

        return Arrays.asList(
                new BookDto("HeadFirst Java","kathey",1,1200.0,"tech"),
                new BookDto("HeadFirst Java","Tony",2,1200.0,"tech"),
                new BookDto("HeadFirst Java","Ram",3,1200.0,"tech"),
                new BookDto("HeadFirst Java","Jarvis",4,1200.0,"tech"),
                new BookDto("HeadFirst Java","Me",5, 1200.0,"tech")
        );
    }

}


