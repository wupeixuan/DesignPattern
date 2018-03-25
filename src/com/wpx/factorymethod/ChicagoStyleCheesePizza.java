package com.wpx.factorymethod;

/**
 * 具体的产品类，实现产品接口-芝加哥风味奶酪披萨
 */
public class ChicagoStyleCheesePizza implements Pizza{
    @Override
    public void make() {
        System.out.println("制作芝加哥风味奶酪披萨");
    }
}