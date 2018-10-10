package com.example.MongodbDemo.enumeration;

public enum  ShoeEnum implements CodeEnum{
    BAREFOOT("bareFoot", "光脚"),
    LEATHERSHOES("leatherShoes", "皮鞋"),
    HIGHHEELSHOES("highHeelShoes", "高跟鞋"),
    SPORTSSHOES("sportsShoes", "运动鞋"),
    BOOTS("boots", "靴子"),
    SANDAL("sandal", "凉鞋");

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

    ShoeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static ShoeEnum getShoesByCode(String code){
        for(ShoeEnum shoeEnum : ShoeEnum.values()){
            if (shoeEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return shoeEnum;
            }
        }
        return null;
    }

    public static ShoeEnum getShoesByValue(String value){
        for(ShoeEnum shoeEnum : ShoeEnum.values()){
            if (shoeEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return shoeEnum;
            }
        }
        return null;
    }
}
