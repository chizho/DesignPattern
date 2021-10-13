package com.awei.singleton.type6;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 10:28
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查,线程安全,同步代码块");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode :" + instance.hashCode());
        System.out.println("instance1.hashCode :" + instance1.hashCode());
    }
}
//双重检查
class Singleton {
    
    private static volatile Singleton instance;

    private Singleton() {
    }
    //提供一个静态的公有方法,加入双重检查代码,解决线程安全问题,同时解决懒加载问题
    //同时保证了效率,推荐使用
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}