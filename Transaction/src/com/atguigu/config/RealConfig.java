package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Liulei
 * @create 2020-07-29 9:34
 */
@Import(SpringConfig.class)  //导入其它配置类
@Configuration
@ComponentScan(basePackages = {"com.atguigu"})   //组件扫描
@EnableTransactionManagement   //开启事务
@PropertySource(value = "classpath:jdbc.properties",encoding = "utf-8")   //加载数据库连接池配置
public class RealConfig {
}
