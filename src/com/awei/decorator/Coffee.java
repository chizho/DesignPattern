package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:19
 */

public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
