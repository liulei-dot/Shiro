package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Liulei
 * @create 2020-07-24 23:37
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add(){
        System.out.println("UserDao add ……");
    }
}
