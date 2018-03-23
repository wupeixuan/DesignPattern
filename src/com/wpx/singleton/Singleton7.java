package com.wpx.singleton;

/**
 * 枚举(线程安全)
 */
public enum Singleton7 {
    //枚举实例的创建是线程安全的，任何情况下都是单例（包括反序列化）
    INSTANCE;
}
