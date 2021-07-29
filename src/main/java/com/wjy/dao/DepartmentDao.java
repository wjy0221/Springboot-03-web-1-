package com.wjy.dao;

import com.wjy.pojo.Department;

import java.util.HashMap;
import java.util.Map;

//部门dao
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Department> departments=null;

    static {

        departments=new HashMap<Integer, Department>();//创建一个部门表

        departments.put(101,new Department(101,"教学部"));
    }
}
