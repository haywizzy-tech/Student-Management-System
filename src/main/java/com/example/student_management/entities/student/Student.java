package com.example.student_management.entities.student;

import lombok.*;

//@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Student {

    private Long id;

    private String name;

    private String email;

    public Student() {

    }

    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(String name) {
        this.name = name;
//        this.email = email;
    }
}
