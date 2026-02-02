package com.vini150cius.project.repositories;

import com.vini150cius.project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
