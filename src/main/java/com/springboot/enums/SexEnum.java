package com.springboot.enums;

public enum SexEnum {
    MAN("1","男"),
    WEMAN("2","女");

    private String code;
    private String label;

    SexEnum(String code, String label) {
        this.code=code;
        this.label=label;
    }
    SexEnum(){

    }
}
