package com.awei.bridge;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 8:38
 */
public class FoldedPthone extends Phone {

    public FoldedPthone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
