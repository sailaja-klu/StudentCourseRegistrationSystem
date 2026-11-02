package com.studentregistration.model;

public class Faculty extends Person {

    private String department;

    public Faculty(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Department: " + department);
    }
}