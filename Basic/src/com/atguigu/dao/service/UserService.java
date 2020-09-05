package com.atguigu.dao.service;

/**
 * @author Liulei
 * @create 2020-07-24 10:54
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        userDao.insert();
        System.out.println("add……");
    }
}
