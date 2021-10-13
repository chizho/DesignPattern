package com.awei.factory.factorymethod.pizzastore.order;

import com.awei.factory.factorymethod.pizzastore.pizza.Pizza;

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
public abstract class OrderPizza {

    //定义一个抽象方法,createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = getType();
            //抽象方法,由工厂子类完成
            pizza = createPizza(orderType);
            if (pizza != null) {
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
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
