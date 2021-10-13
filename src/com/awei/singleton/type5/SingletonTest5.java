package com.awei.singleton.type5;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 10:16
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        System.out.println("懒汉式3 : 线程不安全,不靠谱");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode :" + instance.hashCode());
        System.out.println("instance1.hashCode :" + instance1.hashCode());
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}