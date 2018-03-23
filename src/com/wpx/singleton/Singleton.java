package com.wpx.singleton;

/**
 * 饿汉式单例模式(线程安全)
 */
public class Singleton {
    //static单例变量
    private static final Singleton instance = new Singleton();

    //私有的构造方法
    private Singleton() {

    }

    //静态方法为调用者提供单例对象
    public static Singleton getInstance() {
        return instance;
    }
}
