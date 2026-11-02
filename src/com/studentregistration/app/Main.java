package com.studentregistration.app;

import com.studentregistration.model.Student;
import com.studentregistration.model.Course;
import com.studentregistration.model.Registration;
import com.studentregistration.service.RegistrationService;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                2600520032L,
                "Sailaja",
                "Java Programming");

        Course course = new Course(
                101,
                "Java Programming",
                4);

        RegistrationService service =
                new RegistrationService();

        Registration registration =
                service.registerStudent(
                        1,
                        student,
                        course);

        System.out.println("STUDENT COURSE REGISTRATION SYSTEM");
        System.out.println("---------------------------------");

        student.displayDetails();

        System.out.println();

        course.displayCourse();

        System.out.println();

        registration.displayRegistration();
    }
}