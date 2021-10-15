package com.awei.builder;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 8:23
 */
//普通房子类
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
