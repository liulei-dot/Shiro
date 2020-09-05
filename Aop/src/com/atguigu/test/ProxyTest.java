package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;
import com.atguigu.proxy.UserProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author Liulei
 * @create 2020-07-27 15:25
 */
public class ProxyTest {
    @Test
    public void proxyTest(){
        Class[] interfaces={UserDao.class};
        //newProxyInstance需要三个参数，类加载器，接口的.class(需要是数组),以及InvocationHandler（可以使用匿名类，此处使用的是实现接口，且将要增强的对象作为参数传入）
        UserDao userDao = (UserDao)Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), interfaces, new UserProxy(new UserDaoImpl()));
        userDao.add(2,3);
        userDao.update("2014");
    }
}
