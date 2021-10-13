package com.awei.factory.simplefactory.pizzastore.order;

import com.awei.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.awei.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.awei.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.awei.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 14:47
 */
//简单工厂类
public class SimpleFactory {


    //根据orderType,返回对应的Pizza 对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
