package com.atsignJar.capricious.repositories;

import com.atsignJar.capricious.models.shelf.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelfRepository extends JpaRepository<Shelf,Long> {
}