package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class VehicleDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    // 表名称
    private final String collection = "vehical";


    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Vehical findOneById(String id) {
        return mongoTemplate.findById(id, Vehical.class, collection);
    }

    /**
     * 根据deviceNumber查找
     * @param deviceNumber
     * @return
     */
    public List<Vehical> findByDeviceNumber(String deviceNumber) {
        Query query = new Query(Criteria.where("deviceNumber").is(deviceNumber));
        return mongoTemplate.find(query, Vehical.class, collection);
    }

    /**
     * 查找所有
     * @return
     */
    public List<Vehical> findAll() {
        return mongoTemplate.findAll(Vehical.class, collection);
    }

    /**
     * 单个存储
     * @param vehical
     */
    public void saveaOne(Vehical vehical) {
        mongoTemplate.insert(vehical, collection);
    }

    /**
     * 批量存储
     * @param vehicals
     */
    public void saveBatch(List<Vehical> vehicals) {
        mongoTemplate.insert(vehicals, collection);
    }

    /**
     * 根据id单独删除
     * @param id
     */
    public void deleteOne(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, collection);
    }

}
