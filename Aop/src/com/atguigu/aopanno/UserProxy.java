package com.atguigu.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Liulei
 * @create 2020-07-27 16:02
 */
@Component
@Aspect  //代表是一个通知增强
@Order(1) //设置增强类优先级
public class UserProxy {
    //相同切入点抽取
    @Pointcut("execution(* com.atguigu.aopanno.User.add(..))")
    public void expression(){

    }
    //前置通知,使用抽取后的表达式
    @Before("expression()")
    public void before(){
        System.out.println("before……");
    }
    //后置通知
    @AfterReturning("expression()")
    public void afterReturning(){
        System.out.println("afterReturning……");
    }
    //环绕通知,比较特别，ProceedingJoinPoint参数一定要有
    @Around("expression()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around……之前");
        proceedingJoinPoint.proceed();
        System.out.println("Around……之后");
    }
    //异常通知
    @AfterThrowing("expression()")
    public void afterThrowing(){
        System.out.println("afterThrowing……");
    }
    //最终通知
    @After("expression()")
    public void after(){
        System.out.println("after……");
    }
}
