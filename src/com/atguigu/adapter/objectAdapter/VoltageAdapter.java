package com.atguigu.adapter.objectAdapter;

// 适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;        // 关联一个聚合

    // 通过构造器，传入一个Vol
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            int srcV = voltage220V.output220V();
            dstV = srcV / 44;
        }
        return dstV;
    }
}
