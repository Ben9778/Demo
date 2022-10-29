package org.example.sevice;

import org.example.demo.entity.Student;
import org.example.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student findStudentById(String id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public List<Student> findStudentList() {
        return studentMapper.findStudentList();
    }
}
