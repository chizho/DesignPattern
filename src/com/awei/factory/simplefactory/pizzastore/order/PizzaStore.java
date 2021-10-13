package com.awei.factory.simplefactory.pizzastore.order;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 14:02
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("---退出程序---");
    }
}
