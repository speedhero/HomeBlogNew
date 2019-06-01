package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    private Long id;

    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * QQ
     */
    private String qq;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 超级管理员、管理员、普通用户
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 公司
     */
    private String company;

    /**
     * 个人博客地址
     */
    private String blog;

    /**
     * 地址
     */
    private String location;

    /**
     * 用户来源(默认ZHYD=本网站注册用户)
     */
    private String source;

    /**
     * 隐私（1：公开，0：不公开）
     */
    private Integer privacy;

    /**
     * 通知：(1：通知显示消息详情，2：通知不显示详情)
     */
    private Integer notification;

    /**
     * 金币值
     */
    private Integer score;

    /**
     * 经验值
     */
    private Integer experience;

    /**
     * 注册IP
     */
    @Column(name = "reg_ip")
    private String regIp;

    /**
     * 最近登录IP
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最近登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Integer loginCount;

    /**
     * 用户备注
     */
    private String remark;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 注册时间
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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取邮箱地址
     *
     * @return email - 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱地址
     *
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取QQ
     *
     * @return qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取头像地址
     *
     * @return avatar - 头像地址
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像地址
     *
     * @param avatar 头像地址
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取超级管理员、管理员、普通用户
     *
     * @return user_type - 超级管理员、管理员、普通用户
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置超级管理员、管理员、普通用户
     *
     * @param userType 超级管理员、管理员、普通用户
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 获取个人博客地址
     *
     * @return blog - 个人博客地址
     */
    public String getBlog() {
        return blog;
    }

    /**
     * 设置个人博客地址
     *
     * @param blog 个人博客地址
     */
    public void setBlog(String blog) {
        this.blog = blog == null ? null : blog.trim();
    }

    /**
     * 获取地址
     *
     * @return location - 地址
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置地址
     *
     * @param location 地址
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取用户来源(默认ZHYD=本网站注册用户)
     *
     * @return source - 用户来源(默认ZHYD=本网站注册用户)
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置用户来源(默认ZHYD=本网站注册用户)
     *
     * @param source 用户来源(默认ZHYD=本网站注册用户)
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取隐私（1：公开，0：不公开）
     *
     * @return privacy - 隐私（1：公开，0：不公开）
     */
    public Integer getPrivacy() {
        return privacy;
    }

    /**
     * 设置隐私（1：公开，0：不公开）
     *
     * @param privacy 隐私（1：公开，0：不公开）
     */
    public void setPrivacy(Integer privacy) {
        this.privacy = privacy;
    }

    /**
     * 获取通知：(1：通知显示消息详情，2：通知不显示详情)
     *
     * @return notification - 通知：(1：通知显示消息详情，2：通知不显示详情)
     */
    public Integer getNotification() {
        return notification;
    }

    /**
     * 设置通知：(1：通知显示消息详情，2：通知不显示详情)
     *
     * @param notification 通知：(1：通知显示消息详情，2：通知不显示详情)
     */
    public void setNotification(Integer notification) {
        this.notification = notification;
    }

    /**
     * 获取金币值
     *
     * @return score - 金币值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置金币值
     *
     * @param score 金币值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取经验值
     *
     * @return experience - 经验值
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * 设置经验值
     *
     * @param experience 经验值
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * 获取注册IP
     *
     * @return reg_ip - 注册IP
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * 设置注册IP
     *
     * @param regIp 注册IP
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    /**
     * 获取最近登录IP
     *
     * @return last_login_ip - 最近登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最近登录IP
     *
     * @param lastLoginIp 最近登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * 获取最近登录时间
     *
     * @return last_login_time - 最近登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最近登录时间
     *
     * @param lastLoginTime 最近登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取登录次数
     *
     * @return login_count - 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取用户备注
     *
     * @return remark - 用户备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置用户备注
     *
     * @param remark 用户备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取用户状态
     *
     * @return status - 用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status 用户状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取注册时间
     *
     * @return create_time - 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置注册时间
     *
     * @param createTime 注册时间
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