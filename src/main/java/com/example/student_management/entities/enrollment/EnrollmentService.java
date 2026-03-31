package com.example.student_management.entities.enrollment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepo;

    public void enrollStudent(Long userId, Long courseId) {
        enrollmentRepo.enrollUser(userId, courseId);
    }
}
