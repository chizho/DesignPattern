package com.awei.builder.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 9:32
 */
//director => 指挥者
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector (HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入houseBuild
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //如何建造房子的流程,交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
