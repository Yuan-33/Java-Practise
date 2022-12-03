package com.eric.service;

import com.eric.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuService {
    int addStudent(Student student);

    int deleteStudentByID(@Param("stuID") int id);

    int updateStudent(Student student);

    Student queryStudentByID(@Param("stuID") int id);

    List<Student> queryAllStudent();
}
