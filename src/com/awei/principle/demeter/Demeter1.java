package com.awei.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/12 9:09
 */
//客户端
public class Demeter1 {
    public static void main(String[] args) {
        //创建一个 SchoolManager对象(学校管理对象)
        SchoolManager schoolManager = new SchoolManager();
        //输出学院员工信息和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        //增加10个员工到list集合
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }
        return list;
    }
}

//分析 SchoolManager 类的直接朋友有哪些 Employee、CollegeManager
//CollegeEmployee 不是直接朋友，而是一个陌生类， 这样违反了迪米特法则
//学校管理
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        //增加5个员工到list集合
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id = " + i);
            list.add(employee);
        }
        return list;
    }

    //完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager sub) {
        //分析问题
        //1. 这里CollegeEmployee不是SchoolManager的直接朋友
        //2. CollegeEmployee 是以局部变量方式出现在SchoolManager
        //3. 违反了迪米特法则
        List<CollegeEmployee> list = sub.getAllEmployee();
        System.out.println("------------分公司员工------------");
        for (CollegeEmployee collegeEmployee : list) {
            System.out.println(collegeEmployee.getId());
        }
        List<Employee> list1 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee employee : list1) {
            System.out.println(employee.getId());
        }
    }
}

