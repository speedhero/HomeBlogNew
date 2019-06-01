package com.ithome.bussiness.enums;

/**
 * @author rick jiang (speedhero@126.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2019/4/16 16:26
 * @since 1.0
 */
public enum NoticeStatusEnum {
    RELEASE("已发布"),
    NOT_RELEASE("未发布");
    private String desc;

    NoticeStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
