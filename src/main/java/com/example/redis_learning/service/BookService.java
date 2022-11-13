package com.example.redis_learning.service;

import com.example.redis_learning.entity.Book;
import com.example.redis_learning.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public void init(){
        bookRepository.save(new Book("مجموعه قوانین مالیات بر ارزش افزوده"));
        bookRepository.save(new Book("مرا با خودت ببر"));
        bookRepository.save(new Book("کار عمیق"));
    }
}