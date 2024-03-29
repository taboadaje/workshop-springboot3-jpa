package com.ensaio.course.services;

import com.ensaio.course.entities.User;
import com.ensaio.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//poderia também usar o anotation @Component e o @Repository que também funcionariam assim como o @Service
@Service
public class UserService {


    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
