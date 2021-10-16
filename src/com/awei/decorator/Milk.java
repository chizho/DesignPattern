package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:31
 */
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
