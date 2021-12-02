package com.atsignJar.capricious.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
    private String name;
    private Shelf shelf;
    @Id @GeneratedValue private Long id;
    public User(){

    }

    public User(String name, Shelf shelf){
        this.name = name;
        this.shelf = shelf;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
