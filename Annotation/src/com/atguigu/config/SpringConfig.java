package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Liulei
 * @create 2020-07-27 9:38
 */
@Configuration   //配置类
@ComponentScan(basePackages = {"com.atguigu"})  //扫描包，或者写为basePackages = {"com.atguigu"}
public class SpringConfig {
}
