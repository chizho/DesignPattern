package com.awei.facade;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 10:35
 */
public class DVDPlayer {
    //使用单例模式,饿汉式
    private static DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void  play(){
        System.out.println("dvd is playing ");
    }

    public void pause(){
        System.out.println("dvd pause ...");
    }
}
