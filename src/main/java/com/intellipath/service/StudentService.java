package com.intellipath.service;

import com.intellipath.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(String id);
    List<Student> getAllStudents();
    Student updateStudent(Student student);
    void deleteStudent(String id);
}
