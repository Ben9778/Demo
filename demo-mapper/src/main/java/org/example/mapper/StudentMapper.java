package org.example.mapper;

import org.example.demo.entity.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 根据id查找学生
     * @param id
     * @return
     */
    Student findStudentById(String id);

    /**
     * 获取全部学生信息
     * @return
     */
    List<Student> findStudentList();

}
