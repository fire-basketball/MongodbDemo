package com.example.MongodbDemo.enumeration;

public enum  HairStyleEnum  implements CodeEnum{

    LONDHAIR("longHair", "长发"),
    SHORTHAIR("shortHair", "短发"),
    BALDHEAD("baldHead", "光头"),
    WITHHAT("withHat","带帽");

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

    HairStyleEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static HairStyleEnum getHairStyleByCode(String code){
        for(HairStyleEnum hairStyleEnum : HairStyleEnum.values()){
            if(hairStyleEnum.getCode().toString().trim().equalsIgnoreCase(code)){
                return hairStyleEnum;
            }
        }
        return null;
    }
    public static HairStyleEnum getHairStyleByValue(String value){
        for(HairStyleEnum hairStyleEnum : HairStyleEnum.values()){
            if(hairStyleEnum.getValue().toString().trim().equalsIgnoreCase(value)){
                return hairStyleEnum;
            }
        }
        return null;
    }
}
