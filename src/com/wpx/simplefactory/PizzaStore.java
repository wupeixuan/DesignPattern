package com.wpx.simplefactory;

/**
 * 测试简单工厂模式-披萨工厂
 */
public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza("乳酪比萨");
        pizza.make();
    }
}
