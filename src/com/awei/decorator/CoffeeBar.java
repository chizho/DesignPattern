package com.awei.decorator;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 10:33
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.print("费用1 = " + order.cost());
        System.out.print(" ; ");
        System.out.println("描述信息 = " + order.getDes());

        //2.加一份牛奶
        order = new Milk(order);
        System.out.print("费用2 = " + order.cost());
        System.out.print(" ; ");
        System.out.println("描述信息 = " + order.getDes());

        //3.加一份巧克力
        order = new Chocolate(order);
        System.out.print("费用3 = " + order.cost());
        System.out.print(" ; ");
        System.out.println("描述信息 = " + order.getDes());

        //4.再加一份巧克力
        order = new Chocolate(order);
        System.out.print("费用4 = " + order.cost());
        System.out.print(" ; ");
        System.out.println("描述信息 = " + order.getDes());
    }
}
