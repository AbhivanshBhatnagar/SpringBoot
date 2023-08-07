package com.learn.jpahibernate.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.jpahibernate.Course;
import com.learn.jpahibernate.jdbc.CourseJdbcRepository;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "course4", "Author4"));
        repository.insert(new Course(2, "course5", "Author5"));
        repository.insert(new Course(3, "course6", "Author6"));
        // repository.deleteById(1);
        System.out.println(repository.findById(3));
        // repository.deleteById(2);
    }
}
