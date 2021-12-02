package com.atsignJar.capricious.repositories;

import com.atsignJar.capricious.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Long> {
}
