package com.ithome.bussiness.enums;

/**
 * @author rick jiang (rick jiang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2019/4/16 16:26
 * @since 1.0
 */
public enum LinkSourceEnum {

    AUTOMATIC("自动申请"),
    ADMIN("管理员添加"),
    OTHER("其他");
    private String desc;

    LinkSourceEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
