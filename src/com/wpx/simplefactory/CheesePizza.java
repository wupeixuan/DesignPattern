package com.wpx.simplefactory;

/**
 * 具体的披萨-乳酪比萨
 */
public class CheesePizza implements Pizza {

    @Override
    public void make() {
        System.out.println("乳酪比萨");
    }
}
