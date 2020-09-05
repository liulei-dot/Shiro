package com.atguigu.test;

import com.atguigu.config.RealConfig;
import com.atguigu.config.SpringConfig;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Liulei
 * @create 2020-07-28 16:15
 */
@SpringJUnitConfig()
public class UserServiceTest {
    private static UserService userService;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        userService = context.getBean("userService", UserService.class);
    }

    @Test
    public void account() {
        userService.account();
    }
    @Test
    public void account2() {
        userService.account();
    }
    @Test
    public void configAccount(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RealConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.account();
    }
    @Test
    public void genericTest(){
        //创建 GenericApplicationContext 对象
        GenericApplicationContext genContext = new GenericApplicationContext();

        //调用 context 的方法对象注册
        genContext.refresh();
        genContext.registerBean("user", User.class,()->new User());

        //获取在 spring 注册的对象
        User user = genContext.getBean("user", User.class);


        //注册时，没有写名字，就要使用类的全路径了
        //genContext.registerBean(User.class,()->new User());
        //User user = genContext.getBean("com.atguigu.domain.User", User.class);


        System.out.println(user);

    }
    public static void main(String[] args) {

    }
}