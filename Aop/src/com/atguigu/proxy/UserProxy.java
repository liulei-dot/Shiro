package com.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Liulei
 * @create 2020-07-27 15:19
 */
//创建代理对象代码
public class UserProxy implements InvocationHandler {
    private Object obj;

    //把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    public UserProxy(Object obj) {
        this.obj = obj;
    }

    //增强的代码
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //顺便打印参数
        System.out.println("动态处理之前……"+ Arrays.toString(args));
        Object result = method.invoke(obj, args);
        //顺便打印方法名
        System.out.println("动态处理之后"+method.getName());

        //将增强方法返回值返回
        return result;
    }
}
