package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Liulei
 * @create 2020-07-27 9:05
 */
@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void add() {
        System.out.println("userDaoImpl2 add……");
    }
}
