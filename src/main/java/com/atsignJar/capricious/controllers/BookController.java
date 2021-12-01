package com.atsignJar.capricious.controllers;

import com.atsignJar.capricious.models.Book;
import com.atsignJar.capricious.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    //Get All Books
    @GetMapping
    public @ResponseBody
    List<Book> getBooks(){return repository.findAll();}

    //Create one
    @PostMapping
    public ResponseEntity<Book> createCustomer(@RequestBody Book newBook){
        return new ResponseEntity<>(repository.save(newBook), HttpStatus.CREATED);
    }


}
