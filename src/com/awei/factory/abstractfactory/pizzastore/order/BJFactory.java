package com.awei.factory.abstractfactory.pizzastore.order;

import com.awei.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.awei.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.awei.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 17:15
 */
//北京工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
