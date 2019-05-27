package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "biz_article_look")
public class BizArticleLook {
    @Id
    private Long id;

    /**
     * 文章ID
     */
    @Column(name = "article_id")
    private Long articleId;

    /**
     * 已登录用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户IP
     */
    @Column(name = "user_ip")
    private String userIp;

    /**
     * 浏览时间
     */
    @Column(name = "look_time")
    private Date lookTime;

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
     * 获取文章ID
     *
     * @return article_id - 文章ID
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 设置文章ID
     *
     * @param articleId 文章ID
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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
     * 获取用户IP
     *
     * @return user_ip - 用户IP
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 设置用户IP
     *
     * @param userIp 用户IP
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * 获取浏览时间
     *
     * @return look_time - 浏览时间
     */
    public Date getLookTime() {
        return lookTime;
    }

    /**
     * 设置浏览时间
     *
     * @param lookTime 浏览时间
     */
    public void setLookTime(Date lookTime) {
        this.lookTime = lookTime;
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