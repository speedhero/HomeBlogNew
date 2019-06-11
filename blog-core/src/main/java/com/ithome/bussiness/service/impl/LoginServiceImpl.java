package com.ithome.bussiness.service.impl;

import com.ithome.bussiness.entity.User;
import com.ithome.bussiness.service.interfaces.ILoginService;
import com.ithome.bussiness.service.interfaces.SysUserService;
import com.ithome.core.shiro.JWTUtil;
import com.ithome.framework.exception.CustomException;
import com.ithome.presistence.mapper.SysUserMapper;
import com.ithome.util.PasswordUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private SysUserService sysUserServiceImpl;
    @Override
    public String jwtLogin(String username, String password) {
        Assert.notNull(username, "用户名不能为空");
        Assert.notNull(password, "密码不能为空");

        User user= sysUserServiceImpl.getByUserName(username);
        String encodePassword="";
        try {
            // 加密当前用户输入密码
            // byte[] bytePassword = DigestUtils.sha1(password.getBytes());
            encodePassword = PasswordUtil.encrypt(password, username);
        }catch(Exception e){
            e.printStackTrace();
        }
        if (!encodePassword.equals(user.getPassword())) {
            throw new CustomException("用户密码错误!");
        }
        //生成 token, 5min后过期
        return JWTUtil.sign(username, encodePassword);
    }
}
