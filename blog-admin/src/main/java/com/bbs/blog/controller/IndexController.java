package com.bbs.blog.controller;

import com.ithome.bussiness.service.impl.LoginServiceImpl;
import com.ithome.bussiness.service.interfaces.ILoginService;
import com.ithome.framework.VO.ResponseVO;
import com.ithome.framework.exception.CustomException;
import com.ithome.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(){
        return "index";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "love";
    }


    @Autowired
    private ILoginService loginServiceImpl;
    //登陆提交地址，和applicationContext-shiro.xml中配置的loginurl一致 session方式登录
  /*  @RequestMapping("/login")
    public String login(HttpServletRequest request)throws Exception{

        //如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器
                throw new CustomException("账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                throw new CustomException("用户名/密码错误");
            } else if("randomCodeError".equals(exceptionClassName)){
                throw new CustomException("验证码错误 ");
            }else {
                throw new Exception();//最终在异常处理器生成未知错误
            }
        }
        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面
        return "login";
    }*/

    //jwt登录方式    @PostMapping 找不到对应handler
    @RequestMapping("/login")
    @ResponseBody
    public void login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
        log.error("username:"+username+"password:"+password);
        String jwtToken=loginServiceImpl.jwtLogin(username, password);
        ResponseVO responseVO= ResultUtil.success("登录成功！");
        responseVO.setData(jwtToken);
        log.error("jwtToken:"+jwtToken);
        response.setHeader("Authorization", jwtToken);
    }
}