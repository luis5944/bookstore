package com.lusinf.bookstore.controllers;

import com.lusinf.bookstore.dtos.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder().title("My First Book").build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
