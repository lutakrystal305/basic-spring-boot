package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.courseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class courseService implements baseService<Course> {
    private courseRepository repository;

    public courseService(courseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course createData(Course course) {
        return repository.save(course);
    }


    @Override
    public Course getData(UUID id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Course> getAllData() {
        return repository.findAll();
    }

    @Override
    public Course updateData(UUID id) { //DTO
        Course data = repository.findById(id).get();
        return data;
    }


    @Override
    public void deleteData(UUID id) {
        repository.deleteById(id);
    }

    public List<Course> searchByKey(String key) {
        return repository.findByNameContainingIgnoreCase(key);
    }
}
