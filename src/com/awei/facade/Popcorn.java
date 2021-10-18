package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:39
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("popcorn  on");
    }

    public void off(){
        System.out.println("popcorn off");
    }
    public void pop(){
        System.out.println("popcorn is poping ");
    }
}
