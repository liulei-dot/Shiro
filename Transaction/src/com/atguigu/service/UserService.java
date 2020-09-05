package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Liulei
 * @create 2020-07-28 16:14
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW,isolation=Isolation.DEFAULT,timeout = -1,readOnly = false,rollbackFor = {Exception.class}) //开启事务，代表此类所有方法都有事务处理
public class UserService {
    @Autowired
    private UserDao userDao;
    public void account(){
        userDao.subMoney();

        //模拟异常
        int i=10/0;

        userDao.addMoney();
    }
}
