package com.awei.builder.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 9:39
 */

public class Client {
    public static void main(String[] args) {
        //监造普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备建造房子的指挥者
        HouseDirector director = new HouseDirector(commonHouse);
        //完成盖房,返回产品(房子)
        House house = director.constructHouse();
        System.out.println("---------------------");
        //建造高楼
        HeightBuilding building = new HeightBuilding();
        //重置建造者
        director.setHouseBuilder(building);
        //完成盖房子
        director.constructHouse();
    }
}
