package com.eric.service;

import com.eric.dao.StuDao;
import com.eric.pojo.Student;

import java.util.List;

public class StuServiceImpl implements StuService{

    private StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    public int addStudent(Student student) {
        return stuDao.addStudent(student);
    }

    @Override
    public int deleteStudentByID(int id) {
        return stuDao.deleteStudentByID(id);
    }

    @Override
    public int updateStudent(Student student) {
        return stuDao.updateStudent(student);
    }

    @Override
    public Student queryStudentByID(int id) {
        return stuDao.queryStudentByID(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return stuDao.queryAllStudent();
    }
}
