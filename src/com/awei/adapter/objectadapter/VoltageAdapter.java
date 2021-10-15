package com.awei.adapter.objectadapter;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 15:14
 */
//适配器类
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; // 关联关系---聚合关系

    //通过构造器,传入一个Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V) {
            int srcV = voltage220V.output220V();//获取220V 电压
            System.out.println("使用对象适配器,进行适配中~~~");
            dstV = srcV / 44;
            System.out.println("适配完成,输出的电压= " + dstV);
        }
        return dstV;
    }
}
