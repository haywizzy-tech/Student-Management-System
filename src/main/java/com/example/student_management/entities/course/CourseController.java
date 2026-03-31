package com.example.student_management.entities.course;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/course")
@RestController
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/save")
    public ResponseEntity<String> saveCourse(@RequestBody Course course) {

        courseService.addCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("Course added successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Course>> getAllCourse() {

        List<Course> allCourses = courseService.getAllCourses();
        return ResponseEntity.status(HttpStatus.OK).body(allCourses);
    }
}
