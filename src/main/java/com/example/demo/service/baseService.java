package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;
import java.util.UUID;

public interface baseService<T> {
    Course createData(Course course);

    Course getData(UUID id);

    public List<T> getAllData();

    Course updateData(UUID id);

    void deleteData(UUID id);
}
