package com.atguigu.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Liulei
 * @create 2020-07-27 16:53
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)  //开启aop，默认不开启
public class AopAnnoConfig {
}
