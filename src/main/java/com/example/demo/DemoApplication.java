package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// create a test method
	@GetMapping // get something out for our server
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Marianne",
						22,
						LocalDate.of(1999, Month.OCTOBER, 7),
						"marianne.rario@my.jru.edu"));
	}

}
