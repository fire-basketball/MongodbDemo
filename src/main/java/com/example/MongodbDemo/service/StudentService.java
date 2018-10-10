package com.example.MongodbDemo.service;

import com.example.MongodbDemo.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public void save(List<Student> stu, String collection);

    public List<Student> findAll(String collection);

    public List<Student> findByName(String name, String collection);

    public List<Student> searchByNameAndDes(String name, String des, String collection);

    public List<Student> searchByNameAndStudentScoreDes(String name, String des, String collection);

    public void update(Student stu, String collection);

    public void remove(String name, String collection);
}
