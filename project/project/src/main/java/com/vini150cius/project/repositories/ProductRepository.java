package com.vini150cius.project.repositories;

import com.vini150cius.project.entities.Category;
import com.vini150cius.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
