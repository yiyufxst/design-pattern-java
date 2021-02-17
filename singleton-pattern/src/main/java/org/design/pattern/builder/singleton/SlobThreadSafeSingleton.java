package org.design.pattern.builder.singleton;

import org.apache.commons.lang3.ObjectUtils;

/**
 * 懒汉单例模式（线程安全）
 */
public class SlobThreadSafeSingleton {
    private static SlobThreadSafeSingleton instance;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private SlobThreadSafeSingleton() {
    }

    public static synchronized SlobThreadSafeSingleton getInstance() {
        if (ObjectUtils.isEmpty(instance)) {
            instance = new SlobThreadSafeSingleton();
        }
        return instance;
    }
}
