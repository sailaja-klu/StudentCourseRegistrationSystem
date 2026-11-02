package com.studentregistration.service;

import com.studentregistration.model.Course;
import com.studentregistration.model.Registration;
import com.studentregistration.model.Student;

public class RegistrationService {

    public RegistrationService() {
    }

    public Registration registerStudent(
            int registrationId,
            Student student,
            Course course) {

        return new Registration(registrationId, student, course);
    }
}