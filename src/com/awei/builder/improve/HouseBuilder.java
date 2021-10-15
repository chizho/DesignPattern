package com.awei.builder.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 9:02
 */
//Builder ==> 抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好,抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子，将产品（房子）返回
    public House buildHouse(){
        return house;
    }
}
