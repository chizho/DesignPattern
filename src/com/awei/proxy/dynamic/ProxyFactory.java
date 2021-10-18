package com.awei.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 14:52
 */
public class ProxyFactory {

    //维护一个目标对象，Object
    private Object target;

    //构造器, 对target 进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象，生成一个代理对象
    public Object getProxyInstance() {
        //说明
        /*
         *  public static Object newProxyInstance(ClassLoader var0, Class<?>[] var1, InvocationHandler var2) throws IllegalArgumentException
         *
         *  1. ClassLoader var0 :指定当前目标对象使用的类加载器,获取加载器的方法固定
         *  2. Class<?>[] var1 : 目标对象实现的接口类型,使用泛型方法确认类型
         *  3. InvocationHandler var2 : 事件处理,执行目标对象方法时,会触发事情处理器方法,会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("JDK 代理开始~~");
                //放射机制调用目标对象的方法
                Object returnVal = method.invoke(target, objects);
                System.out.println("JDK代理提交...");
                return returnVal;
            }
        });
    }
}
