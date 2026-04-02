package com.example.student_management.entities.student;

import com.example.student_management.entities.student.dto.StudentsWithCourses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@ShellComponent
public class StudentController {

    private final StudentService studentService;

    @ShellMethod(key = "add", value = "addStudent")
    public String createStudent( String name, String email ) {

        studentService.createStudent( name, email);

        return "User saved successfully";
    }

    @ShellMethod(key="get", value = "get all student")
    public List<Students> getAllStudents() {

        return studentService.getAllStudents();

    }

    @ShellMethod(key="getStudentCourses", value = "get all student")
    public List<StudentsWithCourses> getAllStudentsWithCourses() {

        return studentService.getStudentsWithCourses();

    }



}
