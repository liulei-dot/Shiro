package com.atguigu.dao;

/**
 * @author Liulei
 * @create 2020-07-27 15:18
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add……");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update……");
        return id;
    }
}
