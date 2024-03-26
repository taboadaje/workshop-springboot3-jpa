package com.ensaio.course.services;

import com.ensaio.course.entities.Category;
import com.ensaio.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//poderia também usar o anotation @Component e o @Repository que também funcionariam assim como o @Service
@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
