package com.atsignJar.capricious.repositories;

import com.atsignJar.capricious.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
