package com.example.student_management.entities.course;


import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CoursesRepository {
    private final JdbcTemplate jdbcTemplate;


    public void save(Courses courses) {
        jdbcTemplate.update("INSERT INTO courses(title) VALUES ( ?)",
                courses.getTitle());
    }

    public List<Courses> getAll() {
        return jdbcTemplate.query(
                "SELECT * FROM courses",
                (rs, rowNum) -> new Courses(
                        rs.getLong("id"),
                        rs.getString("title")
                )
        );
    }
}
