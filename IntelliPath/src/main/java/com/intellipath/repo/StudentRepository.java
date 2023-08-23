package com.intellipath.repo;

import com.intellipath.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    private final Map<String, Student> students;

    public StudentRepository() {
        this.students = new HashMap<>();
    }

    public void save(Student student) {
        students.put(student.getId(), student);
    }

    public Student getById(String id) {
        return students.get(id);
    }

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

    public void update(Student student) {
        students.put(student.getId(), student);
    }

    public void deleteById(String id) {
        students.remove(id);
    }

    public boolean exists(String id) {
        return students.containsKey(id);
    }
}
