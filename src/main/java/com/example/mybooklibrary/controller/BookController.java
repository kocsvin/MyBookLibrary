package com.example.mybooklibrary.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {
    ArrayList<String> bookTitles = new ArrayList<String>();

    @GetMapping(value = "/")
    public String index() {
        return "Hi! I am parrot. I repeat what you say.";
    }
    @PostMapping(value = "/book")
    public void addBook(@RequestBody String book) {
        bookTitles.add(book);
    }
    @GetMapping(value = "/allBooks")
    public ArrayList<String> getBooks() {
        return bookTitles;
    }

    @DeleteMapping(value = "/book")
    public void deleteLearnedWord(@RequestBody String deletedBook) {
        for (String book : bookTitles) {
            bookTitles.removeIf( n -> book.equals(deletedBook));
        }
            
    }


}
