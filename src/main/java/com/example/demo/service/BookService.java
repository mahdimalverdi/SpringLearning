package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
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