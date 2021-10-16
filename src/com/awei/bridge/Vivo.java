package com.awei.bridge;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 8:35
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}