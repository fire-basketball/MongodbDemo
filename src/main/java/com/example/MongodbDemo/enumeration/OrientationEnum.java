package com.example.MongodbDemo.enumeration;

public enum OrientationEnum implements CodeEnum {
    //朝向（正面、背面、侧面）
    FRONT("front", "正面"),
    BACK("back", "背面"),
    SIDE("side", "侧面");

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

    OrientationEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static OrientationEnum getShoesByCode(String code){
        for(OrientationEnum orientationEnum : OrientationEnum.values()){
            if (orientationEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return orientationEnum;
            }
        }
        return null;
    }

    public static OrientationEnum getShoesByValue(String value){
        for(OrientationEnum orientationEnum : OrientationEnum.values()){
            if (orientationEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return orientationEnum;
            }
        }
        return null;
    }
}
