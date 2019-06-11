package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "biz_article")
public class BizArticle {
    @Id
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 文章封面图片
     */
    @Column(name = "cover_image")
    private String coverImage;

    /**
     * 文章专属二维码地址
     */
    @Column(name = "qrcode_path")
    private String qrcodePath;

    @Column(name = "is_markdown")
    private Boolean isMarkdown;

    /**
     * 是否置顶
     */
    private Boolean top;

    /**
     * 类型
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 是否推荐
     */
    private Boolean recommended;

    /**
     * 是否原创
     */
    private Boolean original;

    /**
     * 文章简介，最多200字
     */
    private String description;

    /**
     * 文章关键字，优化搜索
     */
    private String keywords;

    /**
     * 是否开启评论
     */
    private Boolean comment;

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
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取文章封面图片
     *
     * @return cover_image - 文章封面图片
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     * 设置文章封面图片
     *
     * @param coverImage 文章封面图片
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    /**
     * 获取文章专属二维码地址
     *
     * @return qrcode_path - 文章专属二维码地址
     */
    public String getQrcodePath() {
        return qrcodePath;
    }

    /**
     * 设置文章专属二维码地址
     *
     * @param qrcodePath 文章专属二维码地址
     */
    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath == null ? null : qrcodePath.trim();
    }

    /**
     * @return is_markdown
     */
    public Boolean getIsMarkdown() {
        return isMarkdown;
    }

    /**
     * @param isMarkdown
     */
    public void setIsMarkdown(Boolean isMarkdown) {
        this.isMarkdown = isMarkdown;
    }

    /**
     * 获取是否置顶
     *
     * @return top - 是否置顶
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * 设置是否置顶
     *
     * @param top 是否置顶
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * 获取类型
     *
     * @return type_id - 类型
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置类型
     *
     * @param typeId 类型
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
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
     * 获取是否推荐
     *
     * @return recommended - 是否推荐
     */
    public Boolean getRecommended() {
        return recommended;
    }

    /**
     * 设置是否推荐
     *
     * @param recommended 是否推荐
     */
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    /**
     * 获取是否原创
     *
     * @return original - 是否原创
     */
    public Boolean getOriginal() {
        return original;
    }

    /**
     * 设置是否原创
     *
     * @param original 是否原创
     */
    public void setOriginal(Boolean original) {
        this.original = original;
    }

    /**
     * 获取文章简介，最多200字
     *
     * @return description - 文章简介，最多200字
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置文章简介，最多200字
     *
     * @param description 文章简介，最多200字
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取文章关键字，优化搜索
     *
     * @return keywords - 文章关键字，优化搜索
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置文章关键字，优化搜索
     *
     * @param keywords 文章关键字，优化搜索
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取是否开启评论
     *
     * @return comment - 是否开启评论
     */
    public Boolean getComment() {
        return comment;
    }

    /**
     * 设置是否开启评论
     *
     * @param comment 是否开启评论
     */
    public void setComment(Boolean comment) {
        this.comment = comment;
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