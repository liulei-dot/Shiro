package com.atguigu.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Liulei
 * @create 2020-07-27 16:46
 */
@Component
@Aspect
@Order(3) //设置增强类优先级
public class UserProxy2 {
    @Pointcut("execution(* com.atguigu.aopanno.User.add(..))")
    public void expression(){

    }
    @Before("expression()")
    public void before(){
        System.out.println("UserProxy2 before……");
    }
}
