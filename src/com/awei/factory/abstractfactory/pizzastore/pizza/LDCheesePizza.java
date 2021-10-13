package com.awei.factory.abstractfactory.pizzastore.pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 13:50
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("给伦敦奶酪Pizza 准备原材料");
    }
}
