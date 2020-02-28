package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("北京芝士披萨");
        System.out.println(" 北京的芝士披萨准备原材料");
    }
}
