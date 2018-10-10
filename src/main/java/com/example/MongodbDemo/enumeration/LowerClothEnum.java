package com.example.MongodbDemo.enumeration;

public enum  LowerClothEnum implements CodeEnum{

    //下身衣着类型：（长裤，短裤，长裙，短裙，连衣裙）
    PLANTS("trousers", "长裤"),
    SHORTPLANTS("pants", "短裤"),
    LONGUETTE("longuette", "长裙"),
    KILT("kilt", "短裙"),
    ONEPIECEDRESS("onePiece", "连衣裙");

    private String code;//colorType;
    private String value; //colorName;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }

    LowerClothEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static LowerClothEnum getColorByCode(String code) {
        for (LowerClothEnum lowerClothEnum : LowerClothEnum.values()) {
            if (lowerClothEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return lowerClothEnum;
            }
        }
        return null;
    }

    public static LowerClothEnum getColorByValue(String value) {
        for (LowerClothEnum lowerClothEnum : LowerClothEnum.values()) {
            if (lowerClothEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return lowerClothEnum;
            }
        }
        return null;
    }
}
