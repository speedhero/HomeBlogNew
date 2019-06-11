package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_config")
public class SysConfig {
    @Id
    private Integer id;

    /**
     * 配置关键字
     */
    @Column(name = "config_key")
    private String configKey;

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
     * 配置项内容
     */
    @Column(name = "config_value")
    private String configValue;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取配置关键字
     *
     * @return config_key - 配置关键字
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * 设置配置关键字
     *
     * @param configKey 配置关键字
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
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

    /**
     * 获取配置项内容
     *
     * @return config_value - 配置项内容
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设置配置项内容
     *
     * @param configValue 配置项内容
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }
}