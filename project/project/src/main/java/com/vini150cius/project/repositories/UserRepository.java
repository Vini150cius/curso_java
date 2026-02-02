package com.vini150cius.project.repositories;

import com.vini150cius.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
