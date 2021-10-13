package com.awei.singleton.type3;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 9:26
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式:线程不安全");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println("singleton.hashCode : " + singleton.hashCode());
        System.out.println("singleton1.hashCode : " + singleton1.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法,当使用到该方法时,才去创建 instance
    //懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}