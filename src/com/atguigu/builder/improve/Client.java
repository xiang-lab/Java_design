package com.atguigu.builder.improve;

public class Client {
    public static void main(String[] args) {
        // 盖高楼
        HighBuilding highBuilding = new HighBuilding();
        // 准备创建房子的指挥者
        HouseDirector houseDirector =  new HouseDirector(highBuilding);
        // 完成盖的房子
        houseDirector.constructHouse();

    }
}