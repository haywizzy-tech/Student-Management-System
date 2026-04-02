package com.example.student_management.entities.student.dto;

import com.example.student_management.entities.course.Courses;
import com.example.student_management.entities.student.Students;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentsWithCourses {

    private Students student;
    private List<Courses> courses = new ArrayList<>();

}
