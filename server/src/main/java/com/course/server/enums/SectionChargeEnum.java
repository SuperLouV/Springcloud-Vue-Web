package com.course.server.enums;

/**
 * @author Yilinlou
 * @date 11/28/20 7:09 下午
 * @Email:ylou7@stevens.edu
 */
public enum SectionChargeEnum {

    CHARGE("C", "收费"),
    FREE("F", "免费");

    private String code;

    private String desc;

    SectionChargeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
