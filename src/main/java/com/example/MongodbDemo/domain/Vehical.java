package com.example.MongodbDemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * 车辆结构属性
 */
@Data
public class Vehical {
    private String _id;
    //卡口id
    private String deviceNumber;
    //日期时间
    private Date time;
    //车辆类型
    private String vehicleType;
    //车辆颜色
    private String vehicleColor;
    //车牌号码
    private String plateNumber;
    //车牌颜色
    private String plateColor;
    //车辆品牌
    private String vehicleBrand;
    //车辆款式
    private String vehicleStyle;
    //车辆朝向
    private String vehicleOrientations;
    //违法行为
    private String illegalAct;
    //年检标
    private String annualInspectionMark;
    //纸巾盒
    private String tissueBox;
    //遮阳板
    private String sunVisor;
    //挂件
    private String pendant;
    //摆件
    private String decoration;
    //无牌或者遮挡号牌
    private String noPlate;
    //是否有可用人脸
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

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleStyle() {
        return vehicleStyle;
    }

    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    public String getVehicleOrientations() {
        return vehicleOrientations;
    }

    public void setVehicleOrientations(String vehicleOrientations) {
        this.vehicleOrientations = vehicleOrientations;
    }

    public String getIllegalAct() {
        return illegalAct;
    }

    public void setIllegalAct(String illegalAct) {
        this.illegalAct = illegalAct;
    }

    public String getAnnualInspectionMark() {
        return annualInspectionMark;
    }

    public void setAnnualInspectionMark(String annualInspectionMark) {
        this.annualInspectionMark = annualInspectionMark;
    }

    public String getTissueBox() {
        return tissueBox;
    }

    public void setTissueBox(String tissueBox) {
        this.tissueBox = tissueBox;
    }

    public String getSunVisor() {
        return sunVisor;
    }

    public void setSunVisor(String sunVisor) {
        this.sunVisor = sunVisor;
    }

    public String getPendant() {
        return pendant;
    }

    public void setPendant(String pendant) {
        this.pendant = pendant;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public int getHasFace() {
        return hasFace;
    }

    public void setHasFace(int hasFace) {
        this.hasFace = hasFace;
    }
}
