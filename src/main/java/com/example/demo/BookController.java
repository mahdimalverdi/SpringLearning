package com.example.demo;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("books/*")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Details of All the Participants",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Page not found",
                    content = @Content)
    })
    @PostMapping()
    public void init() {
        bookService.init();
    }

    @GetMapping()
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(bookService.list());
    }
}

