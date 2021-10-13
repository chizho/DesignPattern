package com.awei.principle.segregation;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 14:07
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new C());
    }
}
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }
    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}
class C implements Interface1{

    @Override
    public void operation1() {
        System.out.println("C 实现了operation1");
    }
    @Override
    public void operation2() {
        System.out.println("C 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("C 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("C 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("C 实现了operation5");
    }
}
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

class D {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}