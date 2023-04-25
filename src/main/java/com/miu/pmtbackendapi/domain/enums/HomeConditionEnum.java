package com.miu.pmtbackendapi.domain.enums;

public enum HomeConditionEnum {
    PERFECT("PERFECT"), EXCELLENT("EXCELLENT"), GOOD("GOOD"), NEED_MINOR_WORK("NEED MINOR WORK"), NEED_MAJOR_WORK("NEED MAJOR WORK");

    String value;

    private HomeConditionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
