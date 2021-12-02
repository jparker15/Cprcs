package com.atsignJar.capricious.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Library {
    @Id@GeneratedValue Long id;
    private List<Book> books;

    public Library(){

    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
