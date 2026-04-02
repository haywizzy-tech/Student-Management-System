package com.example.student_management.entities.course;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ShellComponent
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @ShellMethod(key = "addCourse")
    public String saveCourse( String title) {

        courseService.addCourse(title);
        return "Course added successfully";
    }

    @ShellMethod(key = "getCourse")
    public List<Courses> getAllCourse() {

        return  courseService.getAllCourses();
    }
}

