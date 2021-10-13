package com.awei.factory.factorymethod.pizzastore.order;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 16:15
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种披萨
        new BJOrderPizza();
        //创建伦敦各种口味的披萨
        new LDOrderPizza();
    }
}
