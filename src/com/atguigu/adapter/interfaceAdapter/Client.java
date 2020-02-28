package com.atguigu.adapter.interfaceAdapter;

public class Client {
    public static void main(String[] args) {
         AbsAdapter absAdapter = new AbsAdapter() {
            // 只需要覆盖重写需要的
            @Override
            public void m1() {
                super.m1();
                System.out.println("运行m1");
            }
        };
         absAdapter.m1();
         absAdapter.m2();
    }
}
