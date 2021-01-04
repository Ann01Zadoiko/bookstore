package com.zadoiko.bookstore.services;


import com.zadoiko.bookstore.dao.BookRepository;
import com.zadoiko.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class BookServicesImp implements BookServices {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    public void setBookDao(BookRepository bookRepository) {
        bookRepository = this.bookRepository;
    }

    @Override
   // @Transactional
  public Book addBook(Book book) {
//    bookDao.addBook(book);
       return bookRepository.save(book);
    }

    @Override
   // @Transactional
    public void updateBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
   // @Transactional
    public void removeBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
   @Transactional
    public Optional<Book> getBookById(Long id) {

        return bookRepository.findById(id);
    }

    @Override
    public Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Iterable<Book> searchByTitle(String search) {
        return bookRepository.findBookByTitleLike("%" + search + "%");
    }

}
