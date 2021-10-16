package com.awei.bridge;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/16 8:42
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPthone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("====================");
        Phone phone1 = new FoldedPthone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("====================");
        Phone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
