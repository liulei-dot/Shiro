package com.atguigu.test;

import com.atguigu.config.SpringConfig;
import com.atguigu.dao.UserDaoImpl;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liulei
 * @create 2020-07-24 23:39
 */
public class AnnotationTest {
    @Test
    public void userDaoTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserDaoImpl userDao = context.getBean("userDao", UserDaoImpl.class);
        userDao.add();
    }
    @Test
    public void userServiceTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void configTest(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
