package com.example.MongodbDemo.service.serviceImpl;

import com.example.MongodbDemo.dao.StudentDao;
import com.example.MongodbDemo.domain.Student;
import com.example.MongodbDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public void save(List<Student> stu, String collection) {
        studentDao.save(stu, collection);
    }

    @Override
    public List<Student> findAll(String collection) {
        return studentDao.findAll(collection);
    }

    @Override
    public List<Student> findByName(String name, String collection) {
        return studentDao.findByName(name, collection);
    }

    @Override
    public List<Student> searchByNameAndDes(String name, String des, String collection) {
        return studentDao.searchByNameAndDes(name, des, collection);
    }

    @Override
    public List<Student> searchByNameAndStudentScoreDes(String name, String des, String collection) {
        return studentDao.searchByNameAndStudentScoreDes(name, des, collection);
    }

    @Override
    public void update(Student stu, String collection) {
        studentDao.update(stu, collection);
    }

    @Override
    public void remove(String name, String collection) {
        studentDao.remove(name, collection);
    }
}
