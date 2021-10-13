package com.awei.singleton.type8;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/13 11:15
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode :" + instance.hashCode());
        System.out.println("instance1.hashCode :" + instance1.hashCode());
        instance.sayOK();
        instance1.sayOK();
    }
}
//使用枚举,可以实现单例,推荐使用
enum Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("OK");
    }
}
