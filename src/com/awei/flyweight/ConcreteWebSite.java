package com.awei.flyweight;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 13:11
 */
public class ConcreteWebSite extends WebSite {

    //共享的部分,内部状态
    private String type = "";//网站发布的形式(类型)

    //构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为 :" + type+"; "+user.getName()+ " 在使用中...");
    }
}
