package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        // 双重检验模式
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

// 懒汉式（线程安全，同步方法）
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // 提供一个静态的公有方法，加入双重代码检查，解决线程安全性问题，同时解决懒加载问题
    // 同时保证了效率，推荐使用
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}