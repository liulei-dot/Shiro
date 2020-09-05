package com.atguigu.aopxml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Liulei
 * @create 2020-07-27 16:02
 */
public class UserProxy {
    public void before(){
        System.out.println("before……");
    }
}
