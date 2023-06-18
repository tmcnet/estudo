package com.in28minutes.springboot.learnjpaandhibernate.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // INSERTING NEW COURSES
        System.out.println("Inserindo cursos no banco de dados");
        
        System.out.println("");

        repository.save(new Course(1, "Learn AWS", "In28Minutes"));
        repository.save(new Course(2, "Learn Azure", "In28Minutes"));
        repository.save(new Course(3, "Learn DevOps", "In28Minutes"));

        // DELETING COURSES
        System.out.println("Deletando curso: Learn AWS do banco de dados");
        
        System.out.println("");

        repository.deleteById(1L);

        // FIND BY ID
        System.out.println("Buscando cursos do banco de dados");
        
        System.out.println("");

        Optional<Course> course2 = repository.findById(2L);
        Optional<Course> course3 = repository.findById(3L);
        List<Course> allCourses = repository.findAll();
        List<Course> in28MinutesCourses = repository.findByAuthor("In28Minutes");
        Course course = repository.findByName("Learn Azure");
        long count = repository.count();

        System.out.println(course2);
        System.out.println(course3);
        System.out.println(allCourses);
        System.out.println(in28MinutesCourses);
        System.out.println(course);
        System.out.println(count);
    }
    
}
