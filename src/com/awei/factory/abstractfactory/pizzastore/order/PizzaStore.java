package com.awei.factory.abstractfactory.pizzastore.order;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 16:15
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
