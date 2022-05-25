package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/* this class will contain all the resources for our API */
@RestController
@RequestMapping(path = "api/v1/student") // new path {localhost:8080/api/v1/student}
public class StudentController {

    @GetMapping
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










