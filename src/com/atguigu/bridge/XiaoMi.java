package com.atguigu.bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi开机");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi关机");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi在打电话");
    }
}
