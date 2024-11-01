package com.VI__236.SmartDeltaSystemsTestTask.services;

import com.VI__236.SmartDeltaSystemsTestTask.models.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student changeStudent(Student student);

    public Student createStudent(Student student);

    public void deleteStudent(String id);
}
