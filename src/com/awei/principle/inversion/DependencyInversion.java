package com.awei.principle.inversion;

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
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息:...";
    }
}

//完成Person接收消息的功能
//方式1分析
//1. 简单,比较容易想到
//2. 如果我们获取的对象是 微信、短信等等，则新增类，同时Person也要增加相应的接收方法
//3. 解决思路：引入一个抽象的接口IReceive，表示接收者，这样Person类与接口IReceive发生依赖
//   因为Email，微信等等属于接受范围，他们各自实现IReceive接口就ok，这样就符合依赖倒置原则
class Person{
    public void receive (Email email){
        System.out.println(email.getInfo());
    }
}