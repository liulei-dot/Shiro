package com.atguigu.test;

import com.atguigu.config.RealConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Liulei
 * @create 2020-07-30 15:09
 */
@SpringJUnitConfig(classes = RealConfig.class)
public class Junit4Test {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test1(){
        System.out.println(jdbcTemplate);
    }
}
