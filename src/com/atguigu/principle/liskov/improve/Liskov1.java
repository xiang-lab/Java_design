package com.atguigu.principle.liskov.improve;

public class Liskov1 {
    public static void main(String[] args) {

    }
}

class Base {

}

// A类
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类
// 怎加一个新功能
class B extends Base {
    // 如果B需要使用A类的方法，使用组合关系
    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b);
    }

    // 我们任然想使用A的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
