package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Student;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(List<Student> stu, String collection){
//        mongoTemplate.save(stu, collection);
        mongoTemplate.insert(stu, collection);
    }

//    public <T>List<T> findAll(String collection){
//        return mongoTemplate.findAll((Class <T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0], collection);
//    }

    public List<Student> findAll(String collection){
        return mongoTemplate.findAll(Student.class, collection);
    }

    public List<Student> findByName(String name, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name));
//        如果要选择相应的字段，用BasicQuery
        BasicDBObject fieldsObject = new BasicDBObject();
        fieldsObject.put("name", true);
        fieldsObject.put("age", true);
        fieldsObject.put("sex", true);
        Query query1 = new BasicQuery(Criteria.where("name").is(name).getCriteriaObject(), fieldsObject);
        mongoTemplate.find(query1, Student.class, collection).forEach((student) -> {
            System.out.println(student);
        });
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public List<Student> searchByNameAndDes(String name, String des, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name).and("des").is(des));
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public List<Student> searchByNameAndStudentScoreDes(String name, String des, String collection){
        List<Student> list = null;
        Query query = new Query(Criteria.where("name").is(name).and("studentScore.des").is(des));
        list = mongoTemplate.find(query, Student.class, collection);
        return list;
    }

    public void update(Student stu, String collection){
        Query query = new Query(Criteria.where("name").is(stu.getName()));
        Update update = new Update().set("des",stu.getDes()).set("studentScore.des",stu.getStudentScore().getDes());
        //更新返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Student.class, collection);
        //更新查询返回的结果集的所有
        //mongoTemplate.updateMulti(query, update, Student.class, collection);
    }

    public void remove(String name, String collection){
        Query query = new Query(Criteria.where("name").is(name));
        mongoTemplate.remove(query, Student.class, collection);
    }
}
