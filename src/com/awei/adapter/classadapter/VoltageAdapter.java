package com.awei.adapter.classadapter;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/15 15:14
 */
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
