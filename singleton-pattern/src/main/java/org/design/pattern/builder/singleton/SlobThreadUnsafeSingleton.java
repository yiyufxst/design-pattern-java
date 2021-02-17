package org.design.pattern.builder.singleton;


import org.apache.commons.lang3.ObjectUtils;

/**
 * 懒汉单例模式（线程不安全）
 */
public class SlobThreadUnsafeSingleton {
    private static SlobThreadUnsafeSingleton instance;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private SlobThreadUnsafeSingleton() {
    }

    public static SlobThreadUnsafeSingleton getInstance() {
        if (ObjectUtils.isEmpty(instance)) {
            instance = new SlobThreadUnsafeSingleton();
        }
        return instance;
    }
}
