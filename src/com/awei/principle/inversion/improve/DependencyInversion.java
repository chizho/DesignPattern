package com.awei.principle.inversion.improve;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/11 15:06
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

//定义接口
interface IReceive {
    String getInfo();
}

class Email implements IReceive {
    @Override
    public String getInfo() {
        return "电子邮件信息:...";
    }
}

//新增微信
class WeiXin implements IReceive {

    @Override
    public String getInfo() {
        return "微信信息...";
    }
}

//方式二
class Person {
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}