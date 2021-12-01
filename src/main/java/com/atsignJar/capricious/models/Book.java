package com.atsignJar.capricious.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    private String title;
    private String author;
    private int year;
    @Id
    @GeneratedValue
    private Long id;
}
