package com.ithome.bussiness.enums;

/**
 * @author rick jiang (speedhero@126.com)
 * @version 1.0
 * @date 2019/7/15 22:00
 * @since 1.0
 */
public enum CachePrefixEnum {

    BIZ("biz_cache_"),
    VIEW("view_cache_"),
    DDOS("ddos_cache_"),
    WX("wx_api_cache_"),
    SPIDER("spider_cache_"),
    ;
    private String prefix;

    CachePrefixEnum(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
