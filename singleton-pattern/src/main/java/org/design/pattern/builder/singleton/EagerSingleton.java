package org.design.pattern.builder.singleton;

/**
 * 饿汉单例模式（线程安全）
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private EagerSingleton() {
    }

    private static EagerSingleton getInstance() {
        return instance;
    }
}
