package com.awei.adapter.objectadapter;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 15:16
 */
//手机类
public class Phone {

    public void charging(IVoltage5V iVoltage5V){

        if (iVoltage5V.output5V() == 5){
            System.out.println("电压为5V, 可以充电~~~");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V, 不能充电!!!");
        }
    }
}
