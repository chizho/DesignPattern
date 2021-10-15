package com.awei.adapter.objectadapter;

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
        System.out.println("====对象适配器模式====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
