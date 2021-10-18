package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:47
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo  on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

}
