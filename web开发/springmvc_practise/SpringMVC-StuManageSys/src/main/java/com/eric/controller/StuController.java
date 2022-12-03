package com.eric.controller;

import com.eric.pojo.Student;
import com.eric.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping("/student")
public class StuController {
    @Autowired
    @Qualifier("StuServiceImpl")
    private StuService stuService;

    @RequestMapping("/allStudent")
    public String list(Model model) {
        List<Student> list = stuService.queryAllStudent();
        model.addAttribute("list", list);
        return "allStudent";
    }

    @RequestMapping("/toAddStudent")
    public String toAddStudent() {
        return "addStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student) {
        System.out.println(student);
        stuService.addStudent(student);
        return "redirect:/student/allStudent";
    }

    @RequestMapping("/toUpdateStudent")
    public String toUpdateStudent(Model model, int id) {
        Student student = stuService.queryStudentByID(id);
        System.out.println(student);
        model.addAttribute("student",student );
        return "updateStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Model model, Student student) {
        System.out.println(student);
        stuService.updateStudent(student);
        Student student2 = stuService.queryStudentByID(student.getStuID());
        model.addAttribute("student", student2);
        return "redirect:/student/allStudent";
    }

    @RequestMapping("/del/{stuId}")
    public String deleteStudent(@PathVariable("stuId") int id) {
        stuService.deleteStudentByID(id);
        return "redirect:/student/allStudent";
    }


}
