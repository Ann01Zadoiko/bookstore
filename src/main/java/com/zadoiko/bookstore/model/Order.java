package com.zadoiko.bookstore.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
//    private LocalDateTime created = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    Client client;
    @ManyToMany
    List<Book> books;


}


