package com.atsignJar.capricious.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shelf {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private List <Book> books;


    public Shelf(){
    }

    public Shelf(String name) {
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
