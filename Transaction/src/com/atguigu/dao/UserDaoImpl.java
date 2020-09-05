package com.atguigu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Liulei
 * @create 2020-07-28 16:12
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addMoney() {
        String sql="update tt_user set money=money+100 where id=?";
        jdbcTemplate.update(sql,1);
    }

    @Override
    public void subMoney() {
        String sql="update tt_user set money=money-100 where id=?";
        jdbcTemplate.update(sql,2);
    }
}
