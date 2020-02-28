package com.atguigu.bridge;

public class FoldedPhone extends Phone {

    // 构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠手机打开 ");
    }

    public void close() {
        super.close();
        System.out.println(" 折叠手机关闭 ");
    }

    public void call() {
        super.call();
        System.out.println(" 折叠手机打电话 ");
    }

}
