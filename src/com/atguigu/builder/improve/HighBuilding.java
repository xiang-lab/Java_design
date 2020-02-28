package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼房子砌墙10mm");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼房子建造屋顶");
    }
}
