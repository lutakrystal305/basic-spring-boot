package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface courseRepository extends JpaRepository<Course, UUID> {
    List<Course> findByName(String name);

    @Query("SELECT c FROM Course c WHERE c.name LIKE %:key%")
    List<Course> searchByKey(@Param("key") String key);

    List<Course> findByNameContainingIgnoreCase(String name);
}
