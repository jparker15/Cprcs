package com.atsignJar.capricious.controllers;

import com.atsignJar.capricious.models.Shelf;
import com.atsignJar.capricious.repositories.ShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/shelf")
public class ShelfController {

    @Autowired
    private ShelfRepository repository;

    @GetMapping
    public @ResponseBody
    List<Shelf> getAllShelves(){return repository.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Shelf> getById(@PathVariable Long id){
        Optional<Shelf> shelf = repository.findById(id);

        if(shelf.isEmpty()){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

        return  new ResponseEntity<>(shelf.get(),HttpStatus.OK);
    }

    @PostMapping
    public Shelf createOne(@RequestBody Shelf newShelf){
        return  repository.save(newShelf);
    }

}
