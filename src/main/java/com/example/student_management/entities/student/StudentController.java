package com.example.student_management.entities.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/student")
@RestController
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {

        studentService.createStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body("User saved successfully");
    }

    @PostMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {

        final var allStudents = studentService.getAllStudents();

        return ResponseEntity.status(HttpStatus.OK).body(allStudents);

    }

}
