package com.awei.proxy.dynamic;



/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 14:37
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        ITeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //proxyInstance = class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance = "+proxyInstance.getClass());
        //通过代理对象,调用目标对象的方法
        proxyInstance.teach();
    }
}
