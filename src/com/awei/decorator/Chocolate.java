package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:29
 */
//具体的Decorator,这里就是调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);//调味品的价格
    }
}
