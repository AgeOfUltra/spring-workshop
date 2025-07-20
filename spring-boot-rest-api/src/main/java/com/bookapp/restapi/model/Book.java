package com.bookapp.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
   private String title;
   private String author;

   @Id
   @GeneratedValue
   private Integer id;

   @Column(name = "cost")
   private Double price;
   private String category;


}
