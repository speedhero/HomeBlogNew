package com.ithome.presistence.beans;

import javax.persistence.*;

@Table(name = "sys_permission")
public class SysPermission {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源类型：menu,permission
     */
    private String type;

    /**
     * 路由地址
     */
    private String router;

    /**
     * 前端组件的引用地址,如果是父节点的将设置redirect
     */
    private String component;

    /**
     * 权限代码字符串
     */
    private String percode;

    /**
     * 父结点id
     */
    private String parentid;

    /**
     * 父结点id列表串
     */
    private String parentids;

    /**
     * 排序号
     */
    private String sortstring;

    /**
     * 是否可用,1：删除，0未删除
     */
    private String deleted;

    /**
     * 是否在菜单列表显示，1为显示，0为不显示
     */
    private String menued;

    /**
     * 图标
     */
    private String icon;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取资源类型：menu,permission
     *
     * @return type - 资源类型：menu,permission
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型：menu,permission
     *
     * @param type 资源类型：menu,permission
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取路由地址
     *
     * @return router - 路由地址
     */
    public String getRouter() {
        return router;
    }

    /**
     * 设置路由地址
     *
     * @param router 路由地址
     */
    public void setRouter(String router) {
        this.router = router == null ? null : router.trim();
    }

    /**
     * 获取前端组件的引用地址,如果是父节点的将设置redirect
     *
     * @return component - 前端组件的引用地址,如果是父节点的将设置redirect
     */
    public String getComponent() {
        return component;
    }

    /**
     * 设置前端组件的引用地址,如果是父节点的将设置redirect
     *
     * @param component 前端组件的引用地址,如果是父节点的将设置redirect
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * 获取权限代码字符串
     *
     * @return percode - 权限代码字符串
     */
    public String getPercode() {
        return percode;
    }

    /**
     * 设置权限代码字符串
     *
     * @param percode 权限代码字符串
     */
    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    /**
     * 获取父结点id
     *
     * @return parentid - 父结点id
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置父结点id
     *
     * @param parentid 父结点id
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * 获取父结点id列表串
     *
     * @return parentids - 父结点id列表串
     */
    public String getParentids() {
        return parentids;
    }

    /**
     * 设置父结点id列表串
     *
     * @param parentids 父结点id列表串
     */
    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
    }

    /**
     * 获取排序号
     *
     * @return sortstring - 排序号
     */
    public String getSortstring() {
        return sortstring;
    }

    /**
     * 设置排序号
     *
     * @param sortstring 排序号
     */
    public void setSortstring(String sortstring) {
        this.sortstring = sortstring == null ? null : sortstring.trim();
    }

    /**
     * 获取是否可用,1：删除，0未删除
     *
     * @return deleted - 是否可用,1：删除，0未删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否可用,1：删除，0未删除
     *
     * @param deleted 是否可用,1：删除，0未删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * 获取是否在菜单列表显示，1为显示，0为不显示
     *
     * @return menued - 是否在菜单列表显示，1为显示，0为不显示
     */
    public String getMenued() {
        return menued;
    }

    /**
     * 设置是否在菜单列表显示，1为显示，0为不显示
     *
     * @param menued 是否在菜单列表显示，1为显示，0为不显示
     */
    public void setMenued(String menued) {
        this.menued = menued == null ? null : menued.trim();
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}