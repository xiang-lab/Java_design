package com.atguigu.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        // 类适配器模式
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
