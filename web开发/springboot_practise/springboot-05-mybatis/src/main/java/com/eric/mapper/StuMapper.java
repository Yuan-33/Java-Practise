package com.eric.mapper;

import com.eric.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StuMapper {


    // 新增一个学生
    int save(Student student);


    // 通过id获得学生信息
    Student get(Integer id);


    // 通过id删除学生
    int delete(Integer id);

}
