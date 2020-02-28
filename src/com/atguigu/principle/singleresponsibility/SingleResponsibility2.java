package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

// 方案2分析
// 遵守原则，但是改动很大

class RoadVehicle {
    public void run (String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run (String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

