package com.vini150cius.project.repositories;

import com.vini150cius.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
