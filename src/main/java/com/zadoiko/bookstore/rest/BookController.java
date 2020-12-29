package com.zadoiko.bookstore.rest;

import com.zadoiko.bookstore.model.Book;
import com.zadoiko.bookstore.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookServices bookServices;

    @RequestMapping(value = "/book/{Id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable Long Id ){
        return bookServices.getBookById(Id).orElse(null);
    }

    @RequestMapping(value ="/books", method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public Iterable<Book> getAllBook(@RequestBody Book book){
        return bookServices.getAllBook();
    }

    @RequestMapping(value = "/books" , method = RequestMethod.GET)
    public Iterable<Book> searchByTitle(@RequestParam String searchString){
        return bookServices.searchByTitle(searchString);
    }

}
