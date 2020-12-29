package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.dao.BookDao;
import com.zadoiko.bookstore.dao.BookRepository;
import com.zadoiko.bookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookServicesImp implements BookServices {

    private BookDao bookDao;
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    public void setBookDao(com.zadoiko.bookstore.dao.BookDao bookDao) {
        bookDao = bookDao;
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
        bookDao.updateBook(book);
    }

    @Override
   // @Transactional
    public boolean removeBook(Long id) {
        return bookDao.removeBook(id);
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
