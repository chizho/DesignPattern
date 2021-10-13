package com.awei.singleton.type2;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/12 16:31
 */

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println("singleton.hashCode : "+singleton.hashCode());
        System.out.println("singleton1.hashCode : "+singleton1.hashCode());
    }
}

//饿汉式(静态变量)
class Singleton {
    //1.结构器私有化,外部不能new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    //静态代码块中,创建单例对象
    static{
         instance = new Singleton();
    }
    //3.提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
