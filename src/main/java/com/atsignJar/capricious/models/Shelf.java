package com.atsignJar.capricious.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue
    private Long id;
    private String libraryName;
    @OneToMany(targetEntity = Book.class,mappedBy = "library",fetch = FetchType.EAGER)
    private List <Book> books;


    public Library(){
    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
}
