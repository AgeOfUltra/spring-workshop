package com.bookapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
   private String title;
   private String author;
   private Integer id;
   private Double price;
   private String category;


}
