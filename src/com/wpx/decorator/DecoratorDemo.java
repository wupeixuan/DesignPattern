package com.wpx.decorator;

/**
 * 测试装饰者模式实例
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }

}
