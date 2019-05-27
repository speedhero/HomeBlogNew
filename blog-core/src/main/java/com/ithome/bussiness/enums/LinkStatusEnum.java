package com.ithome.bussiness.enums;

/**
 * @author rick jiang (rick jiang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2019/4/16 16:26
 * @since 1.0
 */
public enum LinkStatusEnum {
    ENABLE("可用"),
    DISABLE("禁用");
    private String desc;

    LinkStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
