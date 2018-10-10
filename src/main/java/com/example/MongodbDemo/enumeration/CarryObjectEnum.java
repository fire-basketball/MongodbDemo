package com.example.MongodbDemo.enumeration;

public enum  CarryObjectEnum implements CodeEnum{
    //携带物（打伞、抱小孩、手上包裹）
    UMBRELLA("umbrella", "打伞"),
    CHILD("child", "抱小孩"),
    HANDPARCEL("handParcel", "手上包裹");

    private String code;
    private String value;

    @Override
    public Object getCode() {
        return code;
    }

    @Override
    public Object getValue() {
        return value;
    }

    CarryObjectEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static CarryObjectEnum getShoesByCode(String code){
        for(CarryObjectEnum carryObjectEnum : CarryObjectEnum.values()){
            if (carryObjectEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return carryObjectEnum;
            }
        }
        return null;
    }

    public static CarryObjectEnum getShoesByValue(String value){
        for(CarryObjectEnum carryObjectEnum : CarryObjectEnum.values()){
            if (carryObjectEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return carryObjectEnum;
            }
        }
        return null;
    }
}
