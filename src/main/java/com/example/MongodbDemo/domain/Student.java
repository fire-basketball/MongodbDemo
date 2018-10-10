package com.example.MongodbDemo.domain;


import lombok.Data;
import org.ietf.jgss.Oid;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class Student implements Serializable{
    @Id
    private String _id;
    private String name;
    private int age;
    private String des;
    private String sex;
    private StudentScore studentScore;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentScore getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(StudentScore studentScore) {
        this.studentScore = studentScore;
    }
}
