package com.example.MongodbDemo.domain;

import lombok.Data;

import java.util.Date;

/**
 *  行人结构化属性类
 */

@Data
public class Pedestrian {

    private String _id;
    //卡口id
    private String deviceNumber;
    //日期时间
    private Date time;
    //性别
    private String gender;
    //年龄
    private int age;
    //眼镜
    private String glasses;
    //墨镜
    private String sunGlasses;
    //口罩
    private String mask;
    //发型特征(长发，短发，光头，帽子)
    private String hairStyle;
    //头部特征（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String headStyle;
    //上身衣着类型（马甲吊带背心、衬衫、西服、T恤、毛衣、皮夹克、羽绒服、大衣风衣、连衣裙、无上衣）
    private String upperBodyClothType;
    //上身衣着颜色：（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String upperBodyClothColor;
    //下身衣着类型：（长裤，短裤，长裙，短裙，连衣裙）
    private String lowerBodyClothType;
    //下身衣着颜色（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String lowerBodyClothColor;
    //衣服纹理（纯色、碎花、条纹、格子）
    private String clothTexture;
    //鞋子类型（光脚、皮鞋、高跟鞋、运动鞋、靴子、凉鞋）
    private String shoesType;
    //鞋子颜色(黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色)
    private String shoesColor;
    //携带包的类型（单肩包、双肩包、拉杆箱、手提包）
    private String bagType;
    //携带包颜色（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String bagColor;
    //体态（胖中瘦）
    private String posture;
    //名族
    private String nation;
    //携带物（打伞、抱小孩、手上包裹）
    private String carryObject;
    //朝向（正面、背面、侧面）
    private String orientations;
    //是否有可用人脸(0  yes, 1  no)
    private int hasFace;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getSunGlasses() {
        return sunGlasses;
    }

    public void setSunGlasses(String sunGlasses) {
        this.sunGlasses = sunGlasses;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getHeadStyle() {
        return headStyle;
    }

    public void setHeadStyle(String headStyle) {
        this.headStyle = headStyle;
    }

    public String getUpperBodyClothType() {
        return upperBodyClothType;
    }

    public void setUpperBodyClothType(String upperBodyClothType) {
        this.upperBodyClothType = upperBodyClothType;
    }

    public String getUpperBodyClothColor() {
        return upperBodyClothColor;
    }

    public void setUpperBodyClothColor(String upperBodyClothColor) {
        this.upperBodyClothColor = upperBodyClothColor;
    }

    public String getLowerBodyClothType() {
        return lowerBodyClothType;
    }

    public void setLowerBodyClothType(String lowerBodyClothType) {
        this.lowerBodyClothType = lowerBodyClothType;
    }

    public String getLowerBodyClothColor() {
        return lowerBodyClothColor;
    }

    public void setLowerBodyClothColor(String lowerBodyClothColor) {
        this.lowerBodyClothColor = lowerBodyClothColor;
    }

    public String getClothTexture() {
        return clothTexture;
    }

    public void setClothTexture(String clothTexture) {
        this.clothTexture = clothTexture;
    }

    public String getShoesType() {
        return shoesType;
    }

    public void setShoesType(String shoesType) {
        this.shoesType = shoesType;
    }

    public String getShoesColor() {
        return shoesColor;
    }

    public void setShoesColor(String shoesColor) {
        this.shoesColor = shoesColor;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getBagColor() {
        return bagColor;
    }

    public void setBagColor(String bagColor) {
        this.bagColor = bagColor;
    }

    public String getPosture() {
        return posture;
    }

    public void setPosture(String posture) {
        this.posture = posture;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCarryObject() {
        return carryObject;
    }

    public void setCarryObject(String carryObject) {
        this.carryObject = carryObject;
    }

    public String getOrientations() {
        return orientations;
    }

    public void setOrientations(String orientations) {
        this.orientations = orientations;
    }

    public int getHasFace() {
        return hasFace;
    }

    public void setHasFace(int hasFace) {
        this.hasFace = hasFace;
    }
}
