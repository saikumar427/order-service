package com.practice.order.service.controller;

import com.practice.order.service.dto.Student;
import com.practice.order.service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{name}")
    public Student welcome(@PathVariable String name) {
        var student = new Student();
        student.setName(name);
        return service.save(student);
    }

    @GetMapping
    public List<Student> welcome() {
        return service.findAll();
    }


}
