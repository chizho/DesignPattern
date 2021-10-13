package com.awei.factory.simplefactory.pizzastore.pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 13:45
 */
//抽象披萨类
public abstract class Pizza {
    //披萨名称
    protected String name;

    //准备原材料,不同披萨不一样,因此做成抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }
    //切割
    public void cut(){
        System.out.println(name + " cutting;");
    }
    //打包
    public void box(){
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
