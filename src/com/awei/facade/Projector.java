package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:43
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("projector  on");
    }

    public void off(){
        System.out.println("projector off");
    }
    public void focus(){
        System.out.println("projector is focus ");
    }
}
