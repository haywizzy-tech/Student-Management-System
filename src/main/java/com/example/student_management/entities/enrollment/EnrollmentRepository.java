package com.example.student_management.entities.enrollment;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class EnrollmentRepository {

    private final JdbcTemplate jdbcTemplate;

    public void enrollUser(Long userId, Long courseId) {
        jdbcTemplate.update("INSERT INTO enrollment (student_id, course_id) VALUES (?, ?)",
                userId, courseId);

    }


}
