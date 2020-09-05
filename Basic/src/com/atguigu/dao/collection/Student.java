package com.atguigu.dao.collection;

import com.atguigu.dao.service.Dept;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Liulei
 * @create 2020-07-24 14:36
 */
public class Student {
    //1 数组类型属性
    private String[] courses;
    //2 list 集合类型属性
    private List<String> list;
    //3 map 集合类型属性
    private Map<String,String> maps;
    //4 set 集合类型属性
    private Set<String> sets;

    //list 属性是对象
    private List<Dept> listObj;
    //map 属性是对象
    private Map<String, Dept> mapObj;

    public void setListObj(List<Dept> listObj) {
        this.listObj = listObj;
    }

    public void setMapObj(Map<String, Dept> mapObj) {
        this.mapObj = mapObj;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", listObj=" + listObj +
                ", mapObj=" + mapObj +
                '}';
    }
}
