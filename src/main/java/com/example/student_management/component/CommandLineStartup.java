package com.example.student_management.component;

import jakarta.annotation.Priority;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
@Order(0)
@Priority(0)
public class CommandLineStartup implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=========================");
        System.out.println("COMMAND LINE RUNNING...");
        System.out.println("=========================");

        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS student (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))");

        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS course (id BIGINT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(255))");

        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS enrollment (id BIGINT AUTO_INCREMENT PRIMARY KEY, student_id BIGINT, course_id BIGINT, CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES student(id), CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES course(id))");


        System.out.println("=========================");
        System.out.println("COMMAND LINE DONE...");
        System.out.println("=========================");
    }
}
