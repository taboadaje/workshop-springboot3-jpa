package com.ensaio.course.repositories;

import com.ensaio.course.entities.OrderItem;
import com.ensaio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
