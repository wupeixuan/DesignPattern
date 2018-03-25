package com.wpx.factorymethod;

/**
 * 具体的工厂类，实现工厂接口-纽约工厂
 */
public class NYPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if (item.equals("乳酪比萨")) {
            pizza = new NYStyleCheesePizza();
        } else if (item.equals("蔬菜披萨")) {
            pizza = new NYStyleVeggiePizza();
        } else {
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}