package com.example.MongodbDemo.enumeration;

public enum BagTypeEnum implements CodeEnum{
    //携带包的类型（单肩包、双肩包、拉杆箱、手提包）
    SHOULDERBAG("shoulderBag", "单肩包"),
    BACKPACK("backpack", "双肩包"),
    DRAWBARBOX("drawbarBox","拉杆箱"),
    HANDBAG("handbag", "手提包");

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

    BagTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static BagTypeEnum getShoesByCode(String code){
        for(BagTypeEnum bagTypeEnum : BagTypeEnum.values()){
            if (bagTypeEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return bagTypeEnum;
            }
        }
        return null;
    }

    public static BagTypeEnum getShoesByValue(String value){
        for(BagTypeEnum bagTypeEnum : BagTypeEnum.values()){
            if (bagTypeEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return bagTypeEnum;
            }
        }
        return null;
    }
}
