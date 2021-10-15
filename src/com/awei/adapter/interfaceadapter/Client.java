package com.awei.adapter.interfaceadapter;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 16:42
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        adapter.m1();
    }
}
