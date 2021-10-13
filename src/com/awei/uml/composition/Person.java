package com.awei.uml.composition;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/12 15:02
 */
public class Person {
    private IDCard idCard; //聚合关系
    private Head head = new Head(); //组合关系
}
class IDCard{}
class Head{}
