package com.awei.factory.abstractfactory.pizzastore.order;

import com.awei.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 17:13
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面工厂子类具体实现
    Pizza createPizza(String orderType);
}
