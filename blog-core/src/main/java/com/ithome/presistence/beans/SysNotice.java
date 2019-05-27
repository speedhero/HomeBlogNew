package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_notice")
public class SysNotice {
    @Id
    private Long id;

    /**
     * 被通知的用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 通知状态
     */
    private String status;

    /**
     * 通知的标题
     */
    private String title;

    /**
     * 通知的内容
     */
    private String content;

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
     * 获取被通知的用户ID
     *
     * @return user_id - 被通知的用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置被通知的用户ID
     *
     * @param userId 被通知的用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取通知状态
     *
     * @return status - 通知状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置通知状态
     *
     * @param status 通知状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取通知的标题
     *
     * @return title - 通知的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置通知的标题
     *
     * @param title 通知的标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取通知的内容
     *
     * @return content - 通知的内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置通知的内容
     *
     * @param content 通知的内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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