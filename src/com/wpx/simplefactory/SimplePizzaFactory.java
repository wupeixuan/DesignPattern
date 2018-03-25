package com.wpx.simplefactory;

/**
 * 披萨工厂类
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equals("乳酪比萨")) {
            return new CheesePizza();
        } else if (type.equals("希腊披萨")) {
            return new GreekPizza();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
