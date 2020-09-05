package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Liulei
 * @create 2020-07-24 23:38
 */
@Service("userService")
public class UserService {
    @Value("张思")
    private String name;//对name赋值为“张思”
    @Resource(name="userDaoImpl2")
    private UserDao userDao;
    public void add(){
        System.out.println("userservice add……"+name);
        userDao.add();
    }
}
