package com.ensaio.course.services;

import com.ensaio.course.entities.Order;
import com.ensaio.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//poderia também usar o anotation @Component e o @Repository que também funcionariam assim como o @Service
@Service
public class OrderService {


    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
