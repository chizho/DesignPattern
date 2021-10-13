package com.awei.principle.singleresponsibility;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 13:15
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 * 方式一
 *
 * @author a.wei
 * @date 2021/10/11 13:20
 * @return
 */
//1. 在方式一的run方法中,违反了单一原则
//2. 解决的方案非常简单,根据交通工具运行方法不同,分解成不同的类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "- 在公路上运行");
    }
}
