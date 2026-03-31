package com.example.student_management.entities.course;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@RequiredArgsConstructor
@ShellComponent
public class CourseShell {

    private final CourseService courseService;

    private final String path = "course/";


    @ShellMethod(value = "Create a course", key = path + "create")
    public String saveCourse(String title) {
        courseService.addCourse(new Course(title));
        return "Course added successfully";
    }

    @ShellMethod(value = "Fetch all course", key = path + "all")
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }

    @ShellMethod(value = "Show all commands", key = path + "help")
    public String commands() {
        return """
                Commands:
                course/create <title>         - Create Course
                course/all                    - View Courses
                """;
    }
}
