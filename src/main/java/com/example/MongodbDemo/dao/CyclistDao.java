package com.example.MongodbDemo.dao;

import com.example.MongodbDemo.domain.Cyclist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
ori
public class CyclistDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    // 表名称
    private final String collection = "cyclist";


    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Cyclist findOneById(String id) {
        return mongoTemplate.findById(id, Cyclist.class, collection);
    }

    /**
     * 根据deviceNumber查找
     * @param deviceNumber
     * @return
     */
    public List<Cyclist> findByDeviceNumber(String deviceNumber) {
        Query query = new Query(Criteria.where("deviceNumber").is(deviceNumber));
        return mongoTemplate.find(query, Cyclist.class, collection);
    }

    /**
     * 查找所有
     * @return
     */
    public List<Cyclist> findAll() {
        return mongoTemplate.findAll(Cyclist.class, collection);
    }

    /**
     * 单个存储骑行
     * @param cyclist
     */
    public void saveaOne(Cyclist cyclist) {
        mongoTemplate.insert(cyclist, collection);
    }

    /**
     * 批量存储骑行
     * @param cyclists
     */
    public void saveBatch(List<Cyclist> cyclists) {
        mongoTemplate.insert(cyclists, collection);
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
