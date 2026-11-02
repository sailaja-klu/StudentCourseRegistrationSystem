package com.studentregistration.model;

public class Registration {

    private int registrationId;
    private Student student;
    private Course course;

    public Registration(int registrationId, Student student, Course course) {
        this.registrationId = registrationId;
        this.student = student;
        this.course = course;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void displayRegistration() {
        System.out.println("Registration ID: " + registrationId);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Credits: " + course.getCredits());
    }
}
