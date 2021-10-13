package com.awei.factory.abstractfactory.pizzastore.order;


import com.awei.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * TODO
 * 订购披萨类
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 13:54
 */
//订购披萨类
public  class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType="";//用户输入
        this.factory = factory;
        do {
            orderType = getType();
            //factory 可能是北京的工厂子类 也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

    //可以获取客户希望订购的披萨类型
    private String getType() {
        try {
            InputStream in;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
