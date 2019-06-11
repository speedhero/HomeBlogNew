package com.ithome;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.ithome.bussiness.entity.User;
import com.ithome.bussiness.service.interfaces.SysUserService;
import com.ithome.bussiness.vo.UserConditionVO;
import com.ithome.presistence.beans.SysUser;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        /*1.加上classpath:前缀（这个时候xml要放在当前目录也就是src下）*/
        ApplicationContext context=new FileSystemXmlApplicationContext("F:/webApp/HomeBlogNew/blog-core/src/main/resources/spring/applicationContext.xml");
       /* 2.加上file:把路径写全(用这个方法xml可以放任意地方)*/
        /*F:\webApp\HomeBlogNew\blog-core\src\main\resources\spring\applicationContext.xml*/
       // ApplicationContext context=new ClassPathXmlApplicationContext("file:F:/webApp/HomeBlogNew/blog-core/src/main/resources/spring/applicationContext.xml");
       // log.info(JSONArray.toJSONString(context.getBeanDefinitionNames()));
        LifecycleBeanPostProcessor postProcessor= (LifecycleBeanPostProcessor)context.getBean("lifecycleBeanPostProcessor");
        System.out.println(postProcessor);
        SysUserService sysUserService= (SysUserService)context.getBean("sysUserServiceImpl");
        List<User>  users=sysUserService.listAll();
        log.info(users.toString());

        //分页
        UserConditionVO userConditionVO=new UserConditionVO();
        userConditionVO.setPageNumber(2);
        userConditionVO.setPageStart(1);
        userConditionVO.setPageSize(2);
        PageInfo<User> pageInfo= sysUserService.findPageBreakByCondition(userConditionVO);
        //得到分页中的person条目对象
        List<User> pageList = pageInfo.getList();
        log.info(pageList.toString());
        //将结果存入map进行传送

    }
}
