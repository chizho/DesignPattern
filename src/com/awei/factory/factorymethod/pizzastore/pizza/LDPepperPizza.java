package com.awei.factory.factorymethod.pizzastore.pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 14:36
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒Pizza");
        System.out.println("给伦敦胡椒Pizza 准备原材料");
    }
}
