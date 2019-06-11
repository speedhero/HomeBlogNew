package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_log")
public class SysLog {
    @Id
    private Long id;

    /**
     * 已登录用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 日志类型（系统操作日志，用户访问日志，异常记录日志）
     */
    private String type;

    /**
     * 日志级别
     */
    @Column(name = "log_level")
    private String logLevel;

    /**
     * 日志内容（业务操作）
     */
    private String content;

    /**
     * 爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     */
    @Column(name = "spider_type")
    private String spiderType;

    /**
     * 操作用户的ip
     */
    private String ip;

    /**
     * 操作用户的user_agent
     */
    private String ua;

    /**
     * 评论时的系统类型
     */
    private String os;

    /**
     * 评论时的浏览器类型
     */
    private String browser;

    /**
     * 请求的路径
     */
    @Column(name = "request_url")
    private String requestUrl;

    /**
     * 请求来源地址
     */
    private String referer;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取已登录用户ID
     *
     * @return user_id - 已登录用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置已登录用户ID
     *
     * @param userId 已登录用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取日志类型（系统操作日志，用户访问日志，异常记录日志）
     *
     * @return type - 日志类型（系统操作日志，用户访问日志，异常记录日志）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置日志类型（系统操作日志，用户访问日志，异常记录日志）
     *
     * @param type 日志类型（系统操作日志，用户访问日志，异常记录日志）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取日志级别
     *
     * @return log_level - 日志级别
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * 设置日志级别
     *
     * @param logLevel 日志级别
     */
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    /**
     * 获取日志内容（业务操作）
     *
     * @return content - 日志内容（业务操作）
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置日志内容（业务操作）
     *
     * @param content 日志内容（业务操作）
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     *
     * @return spider_type - 爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     */
    public String getSpiderType() {
        return spiderType;
    }

    /**
     * 设置爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     *
     * @param spiderType 爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     */
    public void setSpiderType(String spiderType) {
        this.spiderType = spiderType == null ? null : spiderType.trim();
    }

    /**
     * 获取操作用户的ip
     *
     * @return ip - 操作用户的ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置操作用户的ip
     *
     * @param ip 操作用户的ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取操作用户的user_agent
     *
     * @return ua - 操作用户的user_agent
     */
    public String getUa() {
        return ua;
    }

    /**
     * 设置操作用户的user_agent
     *
     * @param ua 操作用户的user_agent
     */
    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }

    /**
     * 获取评论时的系统类型
     *
     * @return os - 评论时的系统类型
     */
    public String getOs() {
        return os;
    }

    /**
     * 设置评论时的系统类型
     *
     * @param os 评论时的系统类型
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * 获取评论时的浏览器类型
     *
     * @return browser - 评论时的浏览器类型
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * 设置评论时的浏览器类型
     *
     * @param browser 评论时的浏览器类型
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * 获取请求的路径
     *
     * @return request_url - 请求的路径
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 设置请求的路径
     *
     * @param requestUrl 请求的路径
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * 获取请求来源地址
     *
     * @return referer - 请求来源地址
     */
    public String getReferer() {
        return referer;
    }

    /**
     * 设置请求来源地址
     *
     * @param referer 请求来源地址
     */
    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}