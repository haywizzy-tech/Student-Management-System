package com.example.student_management.entities.student;

import com.example.student_management.entities.course.Courses;
import com.example.student_management.entities.student.dto.StudentsWithCourses;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class StudentRepository {


    private final JdbcTemplate jdbcTemplate;

    public void save(Students student) {

        jdbcTemplate.update("INSERT INTO students (name, email) VALUES ( ?, ?)",
                student.getName(), student.getEmail()
        );

    }

    public List<Students> getAll() {

        return jdbcTemplate.query("SELECT * FROM students", (rs, rowNum) ->
                new Students(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));

    }

    public List<StudentsWithCourses> getStudentsWithCourses() {

        String sql = """
            SELECT s.id AS student_id, s.email AS student_email, s.name AS student_name,
                   c.id AS course_id, c.title AS course_title
            FROM students s
            JOIN enrollments e ON e.student_id = s.id
            JOIN courses c ON e.course_id = c.id
            ORDER BY s.id
            """;

        Map<Long, StudentsWithCourses> map = new LinkedHashMap<>();

        jdbcTemplate.query(sql, rs -> {

            final Long studentId = rs.getLong("student_id");
            final String studentEmail = rs.getString("student_email");
            final String studentName = rs.getString("student_name");

            map.putIfAbsent(studentId, new StudentsWithCourses(
                    new Students(studentId, studentName, studentEmail),
                    new ArrayList<>()
            ));

            map.get(studentId).getCourses().add(new Courses(
                    rs.getLong("course_id"),
                    rs.getString("course_title")
            ));
        });

        return new ArrayList<>(map.values());
    }




}
