package com.awei.principle.singleresponsibility;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 13:22
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle rvehicle = new RoadVehicle();
        rvehicle.run("摩托车");
        rvehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

//方案2的分析
//1.遵守单一职责原则
//2.但是这样对象改动很大,即将类分解,同时修改客户端
//3.改进:直接修改Vehicle类,改动的代码会比较少
class RoadVehicle{
    public void  run (String vehicle){
        System.out.println(vehicle +" 在公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle +" 在空中运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle +" 在水中运行");
    }
}