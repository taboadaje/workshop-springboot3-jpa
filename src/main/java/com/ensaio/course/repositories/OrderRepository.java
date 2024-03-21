package com.ensaio.course.repositories;

import com.ensaio.course.entities.Order;
import com.ensaio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
