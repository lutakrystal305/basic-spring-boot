package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.courseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class courseController {
    private courseService service;

    public courseController(courseService service) {
        this.service = service;
    }

    @RequestMapping("course")
    public List<Course> getData(@RequestParam(value="key", required = false) String key) {
        if (key != null && key.length() > 0) {
            return service.searchByKey(key);
        }
        return service.getAllData();
    }

}
