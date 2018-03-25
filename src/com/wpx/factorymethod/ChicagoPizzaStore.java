package com.wpx.factorymethod;

/**
 * 具体的工厂类，实现工厂接口-芝加哥工厂
 */
public class ChicagoPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if (item.equals("乳酪比萨")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (item.equals("蔬菜披萨")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else {
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}
