package com.atguigu.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance =  Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        instance.sayok();
    }
}

// 使用枚举，可以实现单例
enum Singleton {
    INSTANCE; // 属性
    public void sayok() {
        System.out.println("oK~");
    }
}