package com.atguigu.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("伦敦的芝士披萨");
        System.out.println(" 伦敦的只是披萨准备原材料");
    }
}
