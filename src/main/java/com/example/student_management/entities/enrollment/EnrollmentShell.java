package com.example.student_management.entities.enrollment;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@RequiredArgsConstructor
@ShellComponent
public class EnrollmentShell {

    private final EnrollmentService enrollmentService;

    private final String path = "enroll/";

    @ShellMethod(value = "Enroll user to course", key = path + "user")
    public String enroll(Long userId, Long courseId) {
        enrollmentService.enrollStudent(userId, courseId);

        return "User enrolled";
    }

    public String commands() {
        return """
                Commands:
                enroll/user <userId> <courseId>    - Enroll user to course
                """;
    }
}
