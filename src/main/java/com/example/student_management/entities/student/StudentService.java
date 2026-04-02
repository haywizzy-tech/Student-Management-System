package com.example.student_management.entities.student;

import com.example.student_management.entities.student.dto.StudentsWithCourses;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void createStudent (String name, String email) {
        Students student = new Students();

        student.setName(name);
        student.setEmail(email);
        studentRepository.save(student);
    }

    public List<Students> getAllStudents() {
        return studentRepository.getAll();
    }

    public List<StudentsWithCourses> getStudentsWithCourses() {
        return studentRepository.getStudentsWithCourses();
    }
}
