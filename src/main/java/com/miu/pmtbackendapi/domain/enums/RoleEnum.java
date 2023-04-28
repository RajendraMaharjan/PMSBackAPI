package com.miu.pmtbackendapi.domain.enums;

public enum RoleEnum {
    OWNER("OWNER"), ADMIN("ADMIN"), CUSTOMER("CUSTOMER"), VIEWER("VIEWER");

    String val;
    RoleEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
