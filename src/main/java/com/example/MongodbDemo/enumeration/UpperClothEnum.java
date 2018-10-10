package com.example.MongodbDemo.enumeration;

public enum UpperClothEnum implements CodeEnum{
    VSETWAISTCOAT("vestWaistcoat", "马甲吊带背心"),
    SHIRT("shirt", "衬衫"),
    SUIT("suit", "西服"),
    TSHIRT("TShirt", "T恤"),
    SWEATER("sweater", "毛衣"),
    JACKET("jacket", "夹克"),
    DOWNCOAT("downCoat", "羽绒服"),
    WINDCOATS("windCoat", "大衣风衣"),
    ONEPIECEDRESS("onePiece", "连衣裙"),
    NULL("null", "无上衣");


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

    UpperClothEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static UpperClothEnum getColorByCode(String code) {
        for (UpperClothEnum upperClothEnum : UpperClothEnum.values()) {
            if (upperClothEnum.getCode().toString().trim().equalsIgnoreCase(code.trim())) {
                return upperClothEnum;
            }
        }
        return null;
    }

    public static UpperClothEnum getColorByValue(String value) {
        for (UpperClothEnum upperClothEnum : UpperClothEnum.values()) {
            if (upperClothEnum.getValue().toString().trim().equalsIgnoreCase(value.trim())) {
                return upperClothEnum;
            }
        }
        return null;
    }
}
