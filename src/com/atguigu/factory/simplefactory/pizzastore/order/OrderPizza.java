package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

//    // 构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;   // 订购Pizza类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName(" 希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName(" 奶酪披萨");
//            } else if (orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName(" 胡椒披萨");
//            } else {
//                break;
//            }
//            // 输出pizza自作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    // 定义一个简单工厂
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory; // 设置简单工厂类
        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
            // 输出披萨信息
            if (pizza != null) {
                pizza.prepare();
                pizza.box();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
