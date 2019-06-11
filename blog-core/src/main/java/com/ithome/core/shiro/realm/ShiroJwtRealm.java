package com.ithome.core.shiro.realm;

import com.ithome.core.shiro.JWTToken;
import com.ithome.core.shiro.JWTUtil;
import com.ithome.bussiness.entity.Resources;
import com.ithome.bussiness.entity.Role;
import com.ithome.bussiness.entity.User;
import com.ithome.bussiness.service.interfaces.SysResourcesService;
import com.ithome.bussiness.service.interfaces.SysRoleService;
import com.ithome.bussiness.service.interfaces.SysUserService;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import javax.annotation.Resource;


import java.util.List;


@Slf4j
public class ShiroJwtRealm extends AuthorizingRealm {
    @Resource
    private SysUserService userService;
    @Resource
    private SysResourcesService resourcesService;
    @Resource
    private SysRoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("————权限认证————");
        String username = JWTUtil.getUsername(principals.toString());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 此处最好使用缓存提升速度
        User userInfo = userService.getByUserName(username);
        List<Role> roleList = roleService.listRolesByUserId(userInfo.getId());
        if (roleList == null || roleList.isEmpty()) {
            return authorizationInfo;
        }
        for (Role role : roleList) {
            authorizationInfo.addRole(role.getName());
            List<Resources> resourcesList= resourcesService.listByUserId(userInfo.getId());
            if (role == null || resourcesList.isEmpty()) {
                continue;
            }
            for (Resources resources : resourcesList) {
                authorizationInfo.addStringPermission(resources.getPermission());
            }
        }
        return authorizationInfo;
    }

    /**
     * 使用JWT替代原生Token
     *
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        String token = (String) authenticationToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        String password= JWTUtil.getPassword(token);
        if (username == null || !JWTUtil.verify(token, username,password)) {
            throw new AuthenticationException("token认证失败！");
        }
        User userInfo = userService.getByUserName(username);
        if (userInfo == null) {
            throw new AuthenticationException("该用户不存在！");
        }
        if (userInfo.getStatus() != 1) {
            throw new AuthenticationException("该用户已被封号！");
        }
        return new SimpleAuthenticationInfo(token, token, "customRealm");
    }

}
