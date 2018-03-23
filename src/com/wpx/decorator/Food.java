package com.wpx.decorator;

/**
 * 被装饰者-食物类
 */
public class Food {
    private String foodName;

    public Food() {

    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    }
}
