package com.atguigu.test;

import com.atguigu.aopanno.AopAnnoConfig;
import com.atguigu.aopanno.User;
import com.atguigu.aopanno.UserProxy;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liulei
 * @create 2020-07-27 16:10
 */
public class AopAnnoTest {
    @Test
    public void aopAnnoTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        //不能直接new，要使用spring创建的user对象
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void aopAnnoConfigTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopAnnoConfig.class);
        //不能直接new，要使用spring创建的user对象
        User user = context.getBean("user", User.class);
        user.add();
    }
}
