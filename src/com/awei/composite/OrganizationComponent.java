package com.awei.composite;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/18 9:23
 */
public abstract class OrganizationComponent {
    private String name;//名字
    private String des;//说明

    //添加
    public void add(OrganizationComponent o){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //删除
    public void remove(OrganizationComponent o){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }
    //打印方法,做成抽象类,子类都需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
