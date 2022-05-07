package com.kimfri.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    String index() {
        return "This is my code";
    }

    @GetMapping("/student")
    Student getStudentById(@PathParam("id") Long id) {
        return Optional.ofNullable(studentRepository.getStudentById(id))
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Student with id= " + id + " not found")
                );
    }

    @GetMapping("/students")
    List<Student> getStudents() {
        return studentRepository.getStudents();
    }
}
