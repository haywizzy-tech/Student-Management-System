package com.example.student_management.entities.course;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Course {

    private Long id;

    private String title;

    public Course(String title){
        this.title = title;
    }
}
