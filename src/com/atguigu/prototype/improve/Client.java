package com.atguigu.prototype.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型克隆");
        Sheep sheep =  new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();  //   克隆

        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
