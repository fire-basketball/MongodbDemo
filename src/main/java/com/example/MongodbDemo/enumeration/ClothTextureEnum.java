package com.example.MongodbDemo.enumeration;

public enum ClothTextureEnum implements CodeEnum{
    //衣服纹理（纯色、碎花、条纹、格子）
    SOLIDCOLOR("solidColor", "纯色"),
    SHIVERING("shivering", "碎花"),
    STRIPES("stripes", "条纹"),
    GRID("grid", "格子");


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

    ClothTextureEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static ClothTextureEnum getShoesByCode(String code){
        for(ClothTextureEnum clothTextureEnum : ClothTextureEnum.values()){
            if (clothTextureEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return clothTextureEnum;
            }
        }
        return null;
    }

    public static ClothTextureEnum getShoesByValue(String value){
        for(ClothTextureEnum clothTextureEnum : ClothTextureEnum.values()){
            if (clothTextureEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return clothTextureEnum;
            }
        }
        return null;
    }
}
