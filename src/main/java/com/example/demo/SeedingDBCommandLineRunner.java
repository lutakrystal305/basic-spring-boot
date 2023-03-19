package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.repository.courseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SeedingDBCommandLineRunner implements CommandLineRunner {
    @Autowired
    private courseRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course("Di dau day", "Di hoc ve");
        Course course2 = new Course("Di lam", "Ke me may");
        Course course3 = new Course("Di hen ho", "Ong noi cha may");
        List<Course> lst = Arrays.asList(course1, course2, course3);
        repository.saveAll(lst);
    }
}
