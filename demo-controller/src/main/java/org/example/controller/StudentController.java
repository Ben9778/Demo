package org.example.controller;

import org.example.demo.entity.Student;
import org.example.sevice.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/getStudent/{id}")
    public Student findStudentById(@PathVariable String id){
        return  studentService.findStudentById(id);
    }
    @GetMapping("/studentList")
    public List<Student> findStudentList(){
        return studentService.findStudentList();
    }
}
