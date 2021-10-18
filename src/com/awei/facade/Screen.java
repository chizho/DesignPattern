package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:46
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("Screen  up");
    }

    public void down(){
        System.out.println("Screen down");
    }

}
