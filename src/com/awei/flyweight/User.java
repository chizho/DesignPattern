package com.awei.flyweight;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 13:28
 */
//享元模式中的外部状态
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
