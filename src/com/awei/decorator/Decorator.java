package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:24
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes 输出被装饰者的信息
        return super.des+" "+ super.getPrice() +" && "+obj.getDes();
    }
}
