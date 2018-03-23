package com.wpx.singleton;

/**
 * 双重校验锁(线程安全)
 */
public class Singleton4 {
    private volatile static Singleton4 instance = null;

    private Singleton4() {

    }

    /**
     * 当第一次调用getInstance()方法时，instance为空，同步操作，保证多线程实例唯一
     * 当第一次后调用getInstance()方法时，instance不为空，不进入同步代码块，减少了不必要的同步
     */
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
