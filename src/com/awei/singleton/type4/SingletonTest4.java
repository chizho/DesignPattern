package com.awei.singleton.type4;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 9:37
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2 : 线程安全");
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

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}