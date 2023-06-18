package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    
    List<Course> findByAuthor(String author);

    Course findByName(String name);
}
