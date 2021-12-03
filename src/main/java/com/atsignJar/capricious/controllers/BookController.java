package com.atsignJar.capricious.controllers;

import com.atsignJar.capricious.models.Book;
import com.atsignJar.capricious.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    //Get by ID
    @GetMapping("/{id}")
    public @ResponseBody Book findById(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //Create one
    @PostMapping
    public ResponseEntity<Book> createCustomer(@RequestBody Book newBook){
        return new ResponseEntity<>(repository.save(newBook), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public @ResponseBody Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook){
        Book book = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if(updatedBook.getTitle() != null) book.setTitle(updatedBook.getTitle());
        if(updatedBook.getAuthor() != null) book.setAuthor(updatedBook.getAuthor());

        return repository.save(book);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> destroyBook(@PathVariable Long id){
        repository.deleteById(id);
        return new ResponseEntity<>("Book" + id +"Destroyed",HttpStatus.OK);
    }

}
