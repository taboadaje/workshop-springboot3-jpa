package com.ensaio.course.resources;

import com.ensaio.course.entities.Order;
import com.ensaio.course.entities.User;
import com.ensaio.course.services.OrderService;
import com.ensaio.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders/")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {

        //Order u = new Order(1L, "Maria", "maria@gmail.com", "9999999", "12345"  );
        List<Order> list = service.findAll();
        return  ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById (@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
