package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookServices {

    public Book addBook(Book book);
    public void updateBook(Book book);
    Optional<Book> getBookById(Long id);
    Iterable<Book>getAllBook();
    Iterable<Book> searchByTitle(String search);
    List<Book> findBookByIdIn (List<Long> Ids);
}

