package com.atguigu.builder.improve;

// 抽象建造者
public abstract class HouseBuilder {
    protected House house = new House();

    // 建造的流程，抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 将建造好的房子返回
    public House buildHouse() {
        return house;
    }
}
