package com.example.MongodbDemo.enumeration;

public enum PostureEnum implements CodeEnum{

    FAT("fat", "胖"),
    MEDIUM("medium", "中"),
    THIN("thin", "瘦");

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

    PostureEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static PostureEnum getShoesByCode(String code){
        for(PostureEnum postureEnum  : PostureEnum.values()){
            if (postureEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return postureEnum;
            }
        }
        return null;
    }

    public static PostureEnum getShoesByValue(String value){
        for(PostureEnum postureEnum : PostureEnum.values()){
            if (postureEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return postureEnum;
            }
        }
        return null;
    }
}
