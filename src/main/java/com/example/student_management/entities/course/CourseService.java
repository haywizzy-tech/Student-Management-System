package com.example.student_management.entities.course;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {

    private final CoursesRepository courseRepository;

    public void addCourse( String title) {
        Courses courses = new Courses();
        courses.setTitle(title);
        courseRepository.save(courses);
    }

    public List<Courses> getAllCourses() {
        return courseRepository.getAll();
    }

}
