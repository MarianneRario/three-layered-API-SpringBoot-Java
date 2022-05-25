package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Marianne",
                        22,
                        LocalDate.of(1999, Month.OCTOBER, 7),
                        "marianne@mapletreemedia.com"
                )
        );
    }
}
