package com.atsignJar.capricious.repositories;


import com.atsignJar.capricious.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
