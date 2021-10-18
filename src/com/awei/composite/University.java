package com.awei.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 9:32
 */
public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent o) {
        organizationComponents.add(o);
    }

    @Override
    public void remove(OrganizationComponent o) {
        organizationComponents.remove(o);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出university包含的学院
    @Override
    protected void print() {
        System.out.println("----------------" + getName() + "----------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
