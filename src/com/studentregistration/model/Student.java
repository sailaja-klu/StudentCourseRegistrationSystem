package com.studentregistration.model;

public class Student extends Person {

    private long studentId;
    private String courseName;

    public Student(long studentId, String name, String courseName) {
        super(name);
        this.studentId = studentId;
        this.courseName = courseName;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + courseName);
    }
}