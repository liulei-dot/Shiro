package com.atguigu.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Liulei
 * @create 2020-07-27 16:01
 */
@Component
public class User {
    public void add() {
       // int i = 12/ 0;
        System.out.println("add.......");
    }
}
