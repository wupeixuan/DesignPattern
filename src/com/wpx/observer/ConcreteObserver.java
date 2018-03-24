package com.wpx.observer;

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer {
    private String name;
    private String message;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到消息：" + message);
    }
}
