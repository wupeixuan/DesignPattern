package com.wpx.simplefactory;

/**
 * 具体的披萨-希腊披萨
 */
public class GreekPizza implements Pizza {

    @Override
    public void make() {
        System.out.println("希腊披萨");

    }
}
