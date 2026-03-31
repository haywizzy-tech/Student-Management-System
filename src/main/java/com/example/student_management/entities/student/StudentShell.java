package com.example.student_management.entities.student;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
@RequiredArgsConstructor
public class StudentShell {

    private final StudentService studentService;

    private final String path = "student/";

    @ShellMethod(value = "Create a student", key = path + "create")
    public String createStudent(String name, String email) {
        studentService.createStudent(new Student(name, email));

        return "Student added";

    }

    @ShellMethod(value = "Fetch all students", key = path + "all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @ShellMethod(value = "Fetch all students with courses", key = path + "all/course")
    public List<StudentsWithCourses> getAllStudentsWithCourses() {
        return studentService.getStudentsWithCourses();
    }


    @ShellMethod(value = "Show all commands", key = path + "help")
    public String commands() {
        return """
                Commands:
                student/create <name> <email>  - Add Student
                student/all                    - View Students
                """;
    }

}
