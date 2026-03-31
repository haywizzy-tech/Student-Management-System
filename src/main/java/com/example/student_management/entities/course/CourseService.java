package com.example.student_management.entities.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.getAll();
    }

}
