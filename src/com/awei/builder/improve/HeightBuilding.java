package com.awei.builder.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 9:24
 */
//高楼
public class HeightBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼房子打地基15米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼房子砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼房子屋顶");
    }
}
