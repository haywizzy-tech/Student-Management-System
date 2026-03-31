package com.example.student_management.entities.course;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CourseRepository {

    private final JdbcTemplate jdbcTemplate;


    public void save(Course course) {
        jdbcTemplate.update("INSERT INTO course(title) VALUES (?)", course.getTitle());
    }

    public List<Course> getAll() {
        return jdbcTemplate.query("SELECT * FROM course", (rs, rowNum) -> new Course(
                rs.getLong("id"),
                rs.getNString("title")
        ));
    }
}
