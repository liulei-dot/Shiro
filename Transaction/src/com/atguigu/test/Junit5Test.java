package com.atguigu.test;


import com.atguigu.config.RealConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Liulei
 * @create 2020-07-30 15:24
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Junit5Test {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        System.out.println(jdbcTemplate);
    }
}
