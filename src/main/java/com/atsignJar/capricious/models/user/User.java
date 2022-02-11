package com.atsignJar.capricious.models.user;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
    private String name;
    @Id
    @GeneratedValue private Long id;
    public User(){

    }

    public User(String name){
        this.name = name;

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


}
