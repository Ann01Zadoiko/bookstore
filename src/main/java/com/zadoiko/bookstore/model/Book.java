package com.zadoiko.bookstore.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "BOOKS")
@Data
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

 //   @Column(name = "AUTHOR")
//    @AttributeOverride({
//            @AttributeOverride(name = "name", column = @Column(name = "author name")),
//            @AttributeOverride(name = "surname", column = @Column(name = "author surname"))
//    })
    private Author author;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "YEAR")
    private String issueYear;

    @Column(name = "PRICE")
    private BigDecimal price;



}
