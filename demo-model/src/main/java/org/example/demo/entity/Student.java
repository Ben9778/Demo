package org.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demo.base.BaseEntity;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseEntity {
    private String id;
    private String student_name;
    private String gender;
    private Timestamp birthday;
    private String student_class;
}
