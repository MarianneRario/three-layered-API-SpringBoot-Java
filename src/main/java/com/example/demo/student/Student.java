package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity // for hibernate
@Table // table in our database
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDate;
    private String email;

    public Student() {
    }

    public Student(Long id, String name, Integer age, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate birthDate, String email) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }
}
