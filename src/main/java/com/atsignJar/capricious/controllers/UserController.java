package com.atsignJar.capricious.controllers;

import com.atsignJar.capricious.models.User;
import com.atsignJar.capricious.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public @ResponseBody
    List<User> getAllUsers() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public @ResponseBody User findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
//        System.out.println(newUser.getLocker().getId());
        return new ResponseEntity<>(repository.save(newUser), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public @ResponseBody User updateUser(@PathVariable Long id, @RequestBody User updatedData) {
        User user = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updatedData.getName() != null) user.setName(updatedData.getName());

        return repository.save(user);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> destroyUser(@PathVariable Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}



