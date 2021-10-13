package com.awei.factory.abstractfactory.pizzastore.pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 14:36
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒Pizza");
        System.out.println("给北京胡椒Pizza 准备原材料");
    }
}
