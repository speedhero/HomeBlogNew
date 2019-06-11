package com.ithome.bussiness.enums;

/**
 * @author rick jiang (speedhero@126.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/4/16 16:26
 * @since 1.0
 */
public enum FileUploadType {
    COMMON("oneblog/"),
    QRCODE("oneblog/qrcode/"),
    SIMPLE("oneblog/article/"),
    COVER_IMAGE("oneblog/cover/");

    private String path;

    FileUploadType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
