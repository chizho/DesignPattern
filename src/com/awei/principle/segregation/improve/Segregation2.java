package com.awei.principle.segregation.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 14:07
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        D d = new D();
        d.depend1(new C());
        d.depend4(new C());
        d.depend5(new C());
    }
}

interface Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}
class B implements Interface1,Interface2{

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

}

class C implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("C 实现了operation1");
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
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

class D {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}