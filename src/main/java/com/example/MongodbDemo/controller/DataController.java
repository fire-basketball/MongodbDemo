package com.example.MongodbDemo.controller;

import com.example.MongodbDemo.domain.Student;
import com.example.MongodbDemo.domain.StudentScore;
import com.example.MongodbDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    public static String collection = "student";

    @Autowired
    private StudentService studentService;

    @RequestMapping("/add")
    public void add(){
        Student student = new Student();
        student.setAge(31);
        student.setDes("hzb_father");
        student.setName("hzb");
        student.setSex("man");
        StudentScore studentScore = new StudentScore();
        studentScore.setChinese("88");
        studentScore.setDes("hzb_child");
        studentScore.setEnglish("93");
        student.setStudentScore(studentScore);

        Student student1=new Student();
        student1.setName("xiaweihu");
        student1.setSex("man");
        student1.setAge(31);
        student1.setDes("xiaweihu_father");
        StudentScore score1=new StudentScore();
        score1.setChinese("66");
        score1.setEnglish("54");
        score1.setDes("xiaweihu_child");
        student1.setStudentScore(score1);

        Student student2=new Student();
        student2.setName("hzb");
        student2.setSex("man");
        student2.setAge(31);
        student2.setDes("hzb_father");
        StudentScore score2=new StudentScore();
        score2.setChinese("77");
        score2.setEnglish("99");
        score2.setDes("hzb_child2");
        student2.setStudentScore(score2);

//        studentService.save(student, collection);
//        studentService.save(student1, collection);
//        studentService.save(student2, collection);
        List<Student> list = Arrays.asList(student,student1,student2);
        studentService.save(list, collection);
    }

    @RequestMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll(collection);
    }

    @RequestMapping("/findByName")
    public List<Student> findByName(){
        return studentService.findByName("hzb", collection);
    }

    @RequestMapping("/findByNameAndDes")
    public List<Student> findByNameAndDes(){
        return studentService.searchByNameAndDes("hzb", "hzb_father", collection);
    }

    @RequestMapping("/findByNameAndStudentScoreDes")
    public List<Student> findByNameAndStudentScoreDes(){
        return studentService.searchByNameAndStudentScoreDes("hzb", "hzb_child2", collection);
    }

    @RequestMapping("/updateByName")
    public void updateByName(){
        List<Student> students=studentService.findByName("xiaweihu", collection);
        Student student=students.get(0);
        student.setDes("aaaaaaaaaaaaaaaaaaaa");
        student.getStudentScore().setDes("bbbbbbbbbbbbbbbbbbbbb");
        studentService.update(student, collection);
    }

    @RequestMapping("/deleteByName")
    public void deleteByName(){
        studentService.remove("xiaweihu", collection);
    }
}
