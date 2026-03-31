package com.example.student_management.entities.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    public List<StudentsWithCourses> getStudentsWithCourses() {
        return studentRepository.getStudentsWithCourses();
    }
}
