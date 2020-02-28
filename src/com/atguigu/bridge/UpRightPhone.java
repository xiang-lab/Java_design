package com.atguigu.bridge;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println(" 直板手机开机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(" 直板手机关机 ");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(" 直板手机打电话 ");
    }
}
