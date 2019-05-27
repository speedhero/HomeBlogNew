package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "biz_comment")
public class BizComment {
    @Id
    private Long id;

    /**
     * 被评论的文章或者页面的ID
     */
    private Long sid;

    /**
     * 评论人的ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 父级评论的id
     */
    private Long pid;

    /**
     * 评论人的QQ（未登录用户）
     */
    private String qq;

    /**
     * 评论人的昵称（未登录用户）
     */
    private String nickname;

    /**
     * 评论人的头像地址
     */
    private String avatar;

    /**
     * 评论人的邮箱地址（未登录用户）
     */
    private String email;

    /**
     * 评论人的网站地址（未登录用户）
     */
    private String url;

    /**
     * 评论的状态
     */
    private String status;

    /**
     * 评论时的ip
     */
    private String ip;

    /**
     * 经度
     */
    private String lng;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 评论时的地址
     */
    private String address;

    /**
     * 评论时的系统类型
     */
    private String os;

    /**
     * 评论时的系统的简称
     */
    @Column(name = "os_short_name")
    private String osShortName;

    /**
     * 评论时的浏览器类型
     */
    private String browser;

    /**
     * 评论时的浏览器的简称
     */
    @Column(name = "browser_short_name")
    private String browserShortName;

    /**
     * 评论的内容
     */
    private String content;

    /**
     * 备注（审核不通过时添加）
     */
    private String remark;

    /**
     * 支持（赞）
     */
    private Integer support;

    /**
     * 反对（踩）
     */
    private Integer oppose;

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
     * 获取被评论的文章或者页面的ID
     *
     * @return sid - 被评论的文章或者页面的ID
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置被评论的文章或者页面的ID
     *
     * @param sid 被评论的文章或者页面的ID
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取评论人的ID
     *
     * @return user_id - 评论人的ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置评论人的ID
     *
     * @param userId 评论人的ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取父级评论的id
     *
     * @return pid - 父级评论的id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父级评论的id
     *
     * @param pid 父级评论的id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取评论人的QQ（未登录用户）
     *
     * @return qq - 评论人的QQ（未登录用户）
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置评论人的QQ（未登录用户）
     *
     * @param qq 评论人的QQ（未登录用户）
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 获取评论人的昵称（未登录用户）
     *
     * @return nickname - 评论人的昵称（未登录用户）
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置评论人的昵称（未登录用户）
     *
     * @param nickname 评论人的昵称（未登录用户）
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取评论人的头像地址
     *
     * @return avatar - 评论人的头像地址
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置评论人的头像地址
     *
     * @param avatar 评论人的头像地址
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取评论人的邮箱地址（未登录用户）
     *
     * @return email - 评论人的邮箱地址（未登录用户）
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置评论人的邮箱地址（未登录用户）
     *
     * @param email 评论人的邮箱地址（未登录用户）
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取评论人的网站地址（未登录用户）
     *
     * @return url - 评论人的网站地址（未登录用户）
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置评论人的网站地址（未登录用户）
     *
     * @param url 评论人的网站地址（未登录用户）
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取评论的状态
     *
     * @return status - 评论的状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置评论的状态
     *
     * @param status 评论的状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取评论时的ip
     *
     * @return ip - 评论时的ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置评论时的ip
     *
     * @param ip 评论时的ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 获取经度
     *
     * @return lng - 经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取评论时的地址
     *
     * @return address - 评论时的地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置评论时的地址
     *
     * @param address 评论时的地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
     * 获取评论时的系统的简称
     *
     * @return os_short_name - 评论时的系统的简称
     */
    public String getOsShortName() {
        return osShortName;
    }

    /**
     * 设置评论时的系统的简称
     *
     * @param osShortName 评论时的系统的简称
     */
    public void setOsShortName(String osShortName) {
        this.osShortName = osShortName == null ? null : osShortName.trim();
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
     * 获取评论时的浏览器的简称
     *
     * @return browser_short_name - 评论时的浏览器的简称
     */
    public String getBrowserShortName() {
        return browserShortName;
    }

    /**
     * 设置评论时的浏览器的简称
     *
     * @param browserShortName 评论时的浏览器的简称
     */
    public void setBrowserShortName(String browserShortName) {
        this.browserShortName = browserShortName == null ? null : browserShortName.trim();
    }

    /**
     * 获取评论的内容
     *
     * @return content - 评论的内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论的内容
     *
     * @param content 评论的内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取备注（审核不通过时添加）
     *
     * @return remark - 备注（审核不通过时添加）
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注（审核不通过时添加）
     *
     * @param remark 备注（审核不通过时添加）
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取支持（赞）
     *
     * @return support - 支持（赞）
     */
    public Integer getSupport() {
        return support;
    }

    /**
     * 设置支持（赞）
     *
     * @param support 支持（赞）
     */
    public void setSupport(Integer support) {
        this.support = support;
    }

    /**
     * 获取反对（踩）
     *
     * @return oppose - 反对（踩）
     */
    public Integer getOppose() {
        return oppose;
    }

    /**
     * 设置反对（踩）
     *
     * @param oppose 反对（踩）
     */
    public void setOppose(Integer oppose) {
        this.oppose = oppose;
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