package com.atsignJar.capricious.repositories;

import com.atsignJar.capricious.models.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Shelf,Long> {
}
