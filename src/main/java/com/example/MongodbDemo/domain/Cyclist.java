package com.example.MongodbDemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * 骑行人结构化属性
 */
@Data
public class Cyclist extends Pedestrian{

    //骑行车的颜色 （黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String bikeColor;
    //车上人数
    private int peopleOnBike;

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }

    public int getPeopleOnBike() {
        return peopleOnBike;
    }

    public void setPeopleOnBike(int peopleOnBike) {
        this.peopleOnBike = peopleOnBike;
    }
}
