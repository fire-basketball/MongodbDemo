package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Pedestrian;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class PedestrianDao {

    private static final String collection = "pedestrian";

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 单个插入，指定集合
     * @param pedestrian
     *
     */
    public void saveOne(Pedestrian pedestrian){
        mongoTemplate.insert(pedestrian, collection);
    }

    /**
     * 批量插入
     * @param pedestrianList
     */
    public void saveBatch(List<Pedestrian> pedestrianList){
        mongoTemplate.insert(pedestrianList, collection);
    }

    /**
     * 无条件查询所有
     * @return
     */
    public List<Pedestrian> findAll(){
        return mongoTemplate.findAll(Pedestrian.class, collection);
    }

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Pedestrian findById(String id){
        return mongoTemplate.findById(id, Pedestrian.class, collection);
    }

    /**
     * 按卡口查询
     * @param deviceNumber
     * @return
     */
    public List<Pedestrian> findByDeviceNumber(String deviceNumber){
        Query query = new Query(Criteria.where("deviceNumber").is(deviceNumber));
        return mongoTemplate.find(query, Pedestrian.class, collection);
    }

    /**
     * 删除指定对象
     * @param pedestrian
     */
    public void remove(Pedestrian pedestrian){
        mongoTemplate.remove(pedestrian, collection);
    }

    /**
     * 根据id删除
     * @param id
     */
    public void removeById(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, collection);
    }

    /**
     * 按id 批量删除
     * @param ids
     */
    public void removeBatch(String []ids){
        Query query = new Query(Criteria.where("_id").in(ids));
        mongoTemplate.remove(query, Pedestrian.class, collection);
    }


}
