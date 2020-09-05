package com.atguigu.dao.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author Liulei
 * @create 2020-07-24 17:51
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("③把 bean 实例传递 bean 后置处理器的方法 postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("⑤把 bean 实例传递 bean 后置处理器的方法 postProcessAfterInitialization");
        return bean;
    }
}
