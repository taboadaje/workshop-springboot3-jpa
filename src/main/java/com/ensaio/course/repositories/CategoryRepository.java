package com.ensaio.course.repositories;

import com.ensaio.course.entities.Category;
import com.ensaio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
