package com.wpx.singleton;

/**
 * 静态内部类(线程安全)
 */
public class Singleton5 {
    /**
     * 静态内部类
     */
    private static class SingleHolder {
        public static Singleton5 instance = new Singleton5();
    }

    //第一次调用getInstance方法时，才会去加载SingleHolder类，继而实例化instance
    public static Singleton5 getInstance() {
        return SingleHolder.instance;
    }

    private Singleton5() {

    }
}
