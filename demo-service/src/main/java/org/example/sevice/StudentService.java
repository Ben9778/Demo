package org.example.sevice;

import org.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public Student findStudentById(String id);
    public List<Student> findStudentList();
}
