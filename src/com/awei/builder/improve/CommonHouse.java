package com.awei.builder.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 9:21
 */
//普通房子
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
