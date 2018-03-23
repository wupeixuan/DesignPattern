package com.wpx.singleton;

/**
 * 并发下的线程安全性
 */
public class SingletonDemo implements Runnable {
    public static void main(String[] args) {
        SingletonDemo[] threads = new SingletonDemo[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SingletonDemo();
        }

        for (int i = 0; i < threads.length; i++) {
            new Thread(threads[i]).start();
        }
    }

    @Override
    public void run() {
//        System.out.println(Singleton.getInstance().hashCode());//饿汉式单例模式(线程安全)
//        System.out.println(Singleton2.getInstance().hashCode());//懒汉式(线程不安全)
//        System.out.println(Singleton3.getInstance().hashCode());//懒汉式(线程安全)
//        System.out.println(Singleton4.getInstance().hashCode());//双重校验锁(线程安全)
//        System.out.println(Singleton5.getInstance().hashCode());//静态内部类(线程安全)
//        System.out.println(Singleton6.getInstance().hashCode());//静态代码块(线程安全)
        System.out.println(Singleton7.INSTANCE.hashCode());//枚举(线程安全)
    }
}
