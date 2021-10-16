package com.awei.bridge;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 8:36
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
