package com.awei.factory.abstractfactory.pizzastore.pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 13:50
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("给北京奶酪Pizza 准备原材料");
    }
}
