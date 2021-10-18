package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:49
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight  on");
    }
    public void off(){
        System.out.println("TheaterLight off");
    }
    public void dim(){
        System.out.println("TheaterLight dim...");
    }
    public void bright(){
        System.out.println("TheaterLight bright...");
    }

}
