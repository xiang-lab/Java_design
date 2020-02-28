package com.atguigu.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 提供一个静态的公有方法，当使用该方法时，才去创建instance
    // 懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}