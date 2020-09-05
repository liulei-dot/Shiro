package com.atguigu.dao.service;

/**
 * @author Liulei
 * @create 2020-07-24 11:34
 */
public class Dept {
    private String name;

    public Dept() {
        System.out.println("①通过构造器创建 bean 实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("②为 bean 的属性设置值和对其他 bean 引用（调用 set 方法）");
    }

    //自定义初始化方法，还要在bean标签里面，使用init-method配置后才能有效
    public void initMethod(){
        System.out.println("④调用 bean 的初始化的方法（需要进行配置初始化的方法）");
    }
    //自定义销毁方法，还要在bean标签里面，使用destory-method配置后才能有效
    public void destoryMethod(){
        System.out.println("⑦当容器关闭时候，调用 bean 的销毁的方法（需要进行配置销毁的方法）");
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
