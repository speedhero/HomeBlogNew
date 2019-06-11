package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_link")
public class SysLink {
    @Id
    private Long id;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 链接名
     */
    private String name;

    /**
     * 链接介绍
     */
    private String description;

    /**
     * 友链站长邮箱
     */
    private String email;

    /**
     * 友链站长QQ
     */
    private String qq;

    private String favicon;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 是否首页显示
     */
    @Column(name = "home_page_display")
    private Boolean homePageDisplay;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源：管理员添加、自动申请
     */
    private String source;

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
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取链接名
     *
     * @return name - 链接名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置链接名
     *
     * @param name 链接名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取链接介绍
     *
     * @return description - 链接介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置链接介绍
     *
     * @param description 链接介绍
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取友链站长邮箱
     *
     * @return email - 友链站长邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置友链站长邮箱
     *
     * @param email 友链站长邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取友链站长QQ
     *
     * @return qq - 友链站长QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置友链站长QQ
     *
     * @param qq 友链站长QQ
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * @return favicon
     */
    public String getFavicon() {
        return favicon;
    }

    /**
     * @param favicon
     */
    public void setFavicon(String favicon) {
        this.favicon = favicon == null ? null : favicon.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取是否首页显示
     *
     * @return home_page_display - 是否首页显示
     */
    public Boolean getHomePageDisplay() {
        return homePageDisplay;
    }

    /**
     * 设置是否首页显示
     *
     * @param homePageDisplay 是否首页显示
     */
    public void setHomePageDisplay(Boolean homePageDisplay) {
        this.homePageDisplay = homePageDisplay;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取来源：管理员添加、自动申请
     *
     * @return source - 来源：管理员添加、自动申请
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源：管理员添加、自动申请
     *
     * @param source 来源：管理员添加、自动申请
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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