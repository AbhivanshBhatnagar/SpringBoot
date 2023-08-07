package com.learn.jpahibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.learn.jpahibernate.Course;
import com.learn.jpahibernate.jpa.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    // @Autowired
    // private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "course1", "Author1"));
        repository.insert(new Course(2, "course2", "Author2"));
        repository.insert(new Course(3, "course3", "Author3"));
        // repository.deleteById(1);
        System.out.println(repository.getById(1));
        // repository.deleteById(2);
    }

}
