package com.awei.principle.liskov.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 16:39
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3 = " + a.func1(11, 3));
        System.out.println("1-8 = " + a.func1(1, 8));
        System.out.println("--------------------------------");
        B b = new B();
        //因为B类不再继承A类,因此调用者,不会func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3 = " + b.func3(11, 3));
        System.out.println("1+8 = " + b.func3(1, 8));
        System.out.println("11+3+9 = " + b.func2(11, 3));

        //使用组合仍然可以使用到A类相关方法
        System.out.println("11-3 = "+ b.func3(11,3));
    }
}

class Base {

}

//A类
class A extends Base {
    //返回两数的差
    public int func1(int a, int b) {
        return a - b;
    }
}

//B类继承了A类
//增加了新功能,完成两个数相加,然后和9求和
class B extends Base {
    //如果B需要使用A类的方法,使用组合关系
    private A a = new A();

    //这里重写了A父类func1()方法
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}