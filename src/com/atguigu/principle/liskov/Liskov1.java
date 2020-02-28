package com.atguigu.principle.liskov;

public class Liskov1 {
    public static void main(String[] args) {

    }
}

// A类
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类
// 怎加一个新功能
class B extends A {

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b);
    }

}
