package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public void init(){
        bookRepository.save(new Book());
        bookRepository.save(new Book("2"));
        bookRepository.save(new Book("3"));
        bookRepository.save(new Book("4"));
    }
}