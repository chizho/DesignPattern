package com.awei.composite;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 9:40
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
