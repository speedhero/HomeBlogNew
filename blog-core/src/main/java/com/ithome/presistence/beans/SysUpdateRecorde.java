package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_update_recorde")
public class SysUpdateRecorde {
    @Id
    private Long id;

    /**
     * 更新版本
     */
    private String version;

    /**
     * 更新记录备注
     */
    private String description;

    /**
     * 项目更新时间
     */
    @Column(name = "recorde_time")
    private Date recordeTime;

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
     * 获取更新版本
     *
     * @return version - 更新版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置更新版本
     *
     * @param version 更新版本
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取更新记录备注
     *
     * @return description - 更新记录备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置更新记录备注
     *
     * @param description 更新记录备注
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取项目更新时间
     *
     * @return recorde_time - 项目更新时间
     */
    public Date getRecordeTime() {
        return recordeTime;
    }

    /**
     * 设置项目更新时间
     *
     * @param recordeTime 项目更新时间
     */
    public void setRecordeTime(Date recordeTime) {
        this.recordeTime = recordeTime;
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