package com.awei.singleton.type7;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 10:28
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode :" + instance.hashCode());
        System.out.println("instance1.hashCode :" + instance1.hashCode());
    }
}

//静态内部类,推荐使用
class Singleton {

    private static volatile Singleton instance;
    //结构器私有化
    private Singleton() {}
    //静态内部类.该类有一个静态属性 Singleton
    //JVM在装载内部类时是线程安全的, 利用JVM底层提供类装载机制
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供一个静态公有方法,直接返回 SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}