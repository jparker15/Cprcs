//package com.atsignJar.capricious.controllers;
//
//import com.atsignJar.capricious.models.Shelf;
//import com.atsignJar.capricious.repositories.ShelfRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/library")
//public class ShelfController {
//
//    @Autowired
//    private ShelfRepository repository;
//
//    @GetMapping
//    public @ResponseBody
//    List<Shelf> getAllLibraries(){return repository.findAll();}
//
//    @GetMapping("/{id}")
//    public @ResponseBody
//    Shelf findById(@PathVariable Long id){
//        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//    }
//
//
//}
