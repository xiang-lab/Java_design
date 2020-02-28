package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

// 方式3分析
// 1.没有做大的修改
// 2.这里虽然没有在类这个级别上遵守单一原子，但是在方法上，遵守单一原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中运行...");
    }
}


