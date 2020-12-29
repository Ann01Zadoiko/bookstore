package com.zadoiko.bookstore.dao;

import com.zadoiko.bookstore.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    public void addBook(Book book);
    public void updateBook(Book book);
    boolean removeBook(Long id);
    Book getBookById(Long id);
    List<Book> getAllBook();
}
