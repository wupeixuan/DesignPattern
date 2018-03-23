package com.wpx.singleton;

/**
 * 静态代码块(线程安全)
 */
public class Singleton6 {

    private Singleton6() {
    }

    private static Singleton6 instance = null;

    // 静态代码块
    static {
        instance = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return instance;
    }
}
