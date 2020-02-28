package com.atguigu.factory.simplefactory.pizzastore.pizza;

// 将Pizza类作成抽象类
public abstract class Pizza {
    protected String name;  // 名字

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cuting");
    }

    // 打包
    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
