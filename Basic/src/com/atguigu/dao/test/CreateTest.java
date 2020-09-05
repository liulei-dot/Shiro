package com.atguigu.dao.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.dao.collection.Student;
import com.atguigu.dao.domain.Person;
import com.atguigu.dao.service.Dept;
import com.atguigu.dao.service.Emp;
import com.atguigu.dao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Liulei
 * @create 2020-07-24 9:40
 */
public class CreateTest {
    @Test
    public void createTest(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取类
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
    @Test
    public void createTest2(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //获取类
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void empTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
    @Test
    public void stuTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
    @Test
    public void beanTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Dept myBean = context.getBean("myBean", Dept.class);
        System.out.println(myBean);
    }
    @Test
    public void SingletonTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Dept dept1 = context.getBean("dept", Dept.class);
        Dept dept2 = context.getBean("dept", Dept.class);
        System.out.println(dept1==dept2);
    }
    @Test
    public void prototypeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Dept dept1 = context.getBean("dept", Dept.class);
        Dept dept2 = context.getBean("dept", Dept.class);
        System.out.println(dept1==dept2);
    }
    @Test
    public void liftTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Dept dept = context.getBean("dept", Dept.class);
        System.out.println("⑥bean 可以使用了（对象获取到了）"+dept);

        //通过close才会调用destoryMethod方法
        context.close();
    }
    @Test
    public void autowiredTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
    @Test
    public void druidTest() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        DataSource druid = context.getBean("druid", DruidDataSource.class);
        Connection conn = druid.getConnection();
        System.out.println(druid);
        conn.close();
    }
}
