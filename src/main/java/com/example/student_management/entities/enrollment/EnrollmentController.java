package com.example.student_management.entities.enrollment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/enrollment")
@RestController
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @PutMapping("/course/{courseId}/user/{userId}")
    public ResponseEntity<String> enrollUser(@PathVariable Long userId, @PathVariable Long courseId) {

        enrollmentService.enrollStudent(userId, courseId);
        return ResponseEntity.ok("User enrolled successfully");
    }
}
