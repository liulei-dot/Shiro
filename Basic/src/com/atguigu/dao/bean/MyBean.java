package com.atguigu.dao.bean;

import com.atguigu.dao.service.Dept;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Liulei
 * @create 2020-07-24 16:43
 */
public class MyBean implements FactoryBean<Dept> {

    @Override
    public Dept getObject() throws Exception {
        //通过getBean得到的是另一个类的对象，而不是MyBean的对象
        Dept dept = new Dept();
        dept.setName("测试");
        return dept;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
