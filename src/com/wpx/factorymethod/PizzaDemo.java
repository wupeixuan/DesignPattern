package com.wpx.factorymethod;

/**
 * 测试工厂方法模式
 */
public class PizzaDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("乳酪比萨");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("乳酪比萨");
    }
}
