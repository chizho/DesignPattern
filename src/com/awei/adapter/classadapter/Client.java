package com.awei.adapter.classadapter;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 15:18
 */
//客户端
public class Client {
    public static void main(String[] args) {
        System.out.println("====类适配器模式====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
