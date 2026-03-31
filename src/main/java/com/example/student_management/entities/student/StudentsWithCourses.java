package com.example.student_management.entities.student;

import com.example.student_management.entities.course.Course;
import jakarta.validation.Valid;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor

public class StudentsWithCourses {
   private Student student;
   private List<Course> courses;
}
