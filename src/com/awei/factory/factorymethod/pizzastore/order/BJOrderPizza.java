package com.awei.factory.factorymethod.pizzastore.order;

import com.awei.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.awei.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.awei.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 16:10
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
