package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:31
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
