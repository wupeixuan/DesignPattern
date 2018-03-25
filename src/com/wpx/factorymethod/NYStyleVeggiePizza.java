package com.wpx.factorymethod;

/**
 * 具体的产品类，实现产品接口-纽约风味蔬菜披萨
 */
public class NYStyleVeggiePizza implements Pizza {
    @Override
    public void make() {
        System.out.println("制作纽约风味蔬菜披萨");
    }
}
