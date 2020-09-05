package com.atguigu.test;

import com.atguigu.aopxml.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liulei
 * @create 2020-07-27 17:09
 */
public class AopXmlTest {
    @Test
    public void aopXmlTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean2.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
}
