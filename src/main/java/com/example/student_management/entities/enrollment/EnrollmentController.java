package com.example.student_management.entities.enrollment;


import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@RequiredArgsConstructor
@ShellComponent
public class EnrollmentController {

    private final EnrollmentService enrollmentService;


    @ShellMethod(value = "Enroll user to course", key = "enroll")
    public String enroll(Long userId, Long courseId) {
        enrollmentService.enrollStudent(userId, courseId);

        return "User enrolled";
    }

}
