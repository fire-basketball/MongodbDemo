package com.example.MongodbDemo.enumeration;

public enum  ColorEnum implements CodeEnum{

    BLACK("black", "黑色"),
    WHITE("white", "白色"),
    RED("red", "红色"),
    YELLOW("yellow", "黄色"),
    BLUE("blue", "蓝色"),
    GREEN("green", "绿色"),
    PURPLE("purple", "紫色"),
    BROWN("brown", "棕色"),
    GRAY("gray", "灰色"),
    ORANGE("orange", "橙色"),
    MULTI("multi", "多色");

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

    ColorEnum(String code, String value){
        this.code = code;
        this.value = value;
    }

    public static ColorEnum getColorByCode(String code){
        for (ColorEnum colorEnum : ColorEnum.values()) {
            if (colorEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return colorEnum;
            }
        }
        return null;
    }

    public static ColorEnum getColorByValue(String value){
        for (ColorEnum colorEnum : ColorEnum.values()) {
            if (colorEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return colorEnum;
            }
        }
        return null;
    }
}
