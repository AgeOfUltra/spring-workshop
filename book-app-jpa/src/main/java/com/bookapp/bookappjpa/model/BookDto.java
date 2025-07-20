package com.bookapp.bookappjpa.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {


    private String title;
 
    private String author;
 
    private Integer id;
 
    private Double price;
 
    private String category;
}
