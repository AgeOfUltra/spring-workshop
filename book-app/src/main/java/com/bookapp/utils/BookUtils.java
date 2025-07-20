package com.bookapp.utils;

import com.bookapp.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookUtils {

    public List<Book> displayBooks(){

        return Arrays.asList(
                new Book("HeadFirst Java","kathey",1,1200.0,"tech"),
                new Book("HeadFirst Java","Tony",2,1200.0,"tech"),
                new Book("HeadFirst Java","Ram",3,1200.0,"tech"),
                new Book("HeadFirst Java","Jarvis",4,1200.0,"tech"),
                new Book("HeadFirst Java","Me",5, 1200.0,"tech")
        );
    }

}


