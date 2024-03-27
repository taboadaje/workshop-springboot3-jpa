package com.ensaio.course.services;

import com.ensaio.course.entities.Product;
import com.ensaio.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//poderia também usar o anotation @Component e o @Repository que também funcionariam assim como o @Service
@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
