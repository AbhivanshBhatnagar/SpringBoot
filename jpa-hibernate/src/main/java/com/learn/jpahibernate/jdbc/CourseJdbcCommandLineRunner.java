package com.learn.jpahibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "course1", "Author1"));
        repository.insert(new Course(2, "course2", "Author2"));
        repository.insert(new Course(3, "course3", "Author3"));
        // repository.deleteById(1);
        System.out.println(repository.getById(1));
    }

}
