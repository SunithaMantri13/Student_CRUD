package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private String studentEMail;
    private String studentAddress;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(Long id, String studentName, String studentEMail, String studentAddress) {
        this.id = id;
        this.studentName = studentName;
        this.studentEMail = studentEMail;
        this.studentAddress = studentAddress;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEMail() {
        return studentEMail;
    }

    public void setStudentEMail(String studentEMail) {
        this.studentEMail = studentEMail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
