package com.awei.factory.simplefactory.pizzastore.order;

import com.awei.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.awei.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.awei.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.awei.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * TODO
 * 订购披萨类
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 13:54
 */
//订购披萨类
public class OrderPizza {

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            }else {
//                break;
//            }
//            //输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
    //定义一个简单工厂对象
    SimpleFactory simpleFactory ;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        //用户输入
        String orderType ="";
        //设置简单工厂对象
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza !=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败,没有 "+orderType+" 披萨");
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
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {

        }
        return "";
    }
}
