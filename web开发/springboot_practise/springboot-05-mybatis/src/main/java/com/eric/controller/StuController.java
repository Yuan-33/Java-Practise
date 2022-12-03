package com.eric.controller;

import com.eric.mapper.StuMapper;
import com.eric.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StuController {

    @Autowired
    StuMapper stuMapper;

    @GetMapping("/save")
    public int save() {
        Student student = new Student();
        student.setId(190425);
        student.setName("ppd");
        student.setPwd("123456");
        return stuMapper.save(student);
    }


    // 通过id获得学生信息
    @GetMapping("/get/{id}")
    public Student get(@PathVariable("id") Integer id) {
        return stuMapper.get(id);
    }


    // 通过id删除学生
    @GetMapping("/delete/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return stuMapper.delete(id);
    }


}
