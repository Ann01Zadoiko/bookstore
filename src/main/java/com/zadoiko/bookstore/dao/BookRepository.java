package com.zadoiko.bookstore.dao;

import com.zadoiko.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Optional<Book> findById (Long along);

    Iterable<Book> findBookByTitleLike(String title);

}
