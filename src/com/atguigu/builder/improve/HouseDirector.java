package com.atguigu.builder.improve;

// 指挥者，动态的去指挥制作的流程
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 构造方法
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter方法
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.house;
    }

}
