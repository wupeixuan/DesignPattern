package com.wpx.factorymethod;

/**
 * 具体的产品类，实现产品接口-纽约风味奶酪披萨
 */
public class NYStyleCheesePizza implements Pizza{
    @Override
    public void make() {
        System.out.println("制作纽约风味奶酪披萨");
    }
}
