package com.atguigu.dao.service;

/**
 * @author Liulei
 * @create 2020-07-24 11:34
 */
public class Emp {
    private String name;
    private String gender;
    //一个员工属于一个部门
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
