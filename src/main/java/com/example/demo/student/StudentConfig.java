package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    // create a bean
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student marianne = new Student(
                    1L,
                    "Marianne",
                    LocalDate.of(1999, Month.OCTOBER, 7),
                    "marianne@gmail.com"
            );

            Student paulo = new Student(
                    "Paulo",
                    LocalDate.of(1999, Month.JULY, 2),
                    "paulo@gmail.com"
            );

            // save these students to the database
            studentRepository.saveAll(List.of(marianne, paulo)); // takes a list
        };
    }

}
