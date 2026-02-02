package com.vini150cius.project.repositories;

import com.vini150cius.project.entities.OrderItem;
import com.vini150cius.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
