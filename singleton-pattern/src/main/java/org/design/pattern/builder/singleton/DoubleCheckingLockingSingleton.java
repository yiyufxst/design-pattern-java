package org.design.pattern.builder.singleton;

import org.apache.commons.lang3.ObjectUtils;

/**
 * 双重校验锁单例模式（线程安全）
 */
public class DoubleCheckingLockingSingleton {
    private static volatile DoubleCheckingLockingSingleton instance;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private DoubleCheckingLockingSingleton() {
    }

    public static DoubleCheckingLockingSingleton getInstance() {
        if (ObjectUtils.isNotEmpty(instance)) {
            return instance;
        }
        synchronized (DoubleCheckingLockingSingleton.class) {
            if (ObjectUtils.isEmpty(instance)) {
                instance = new DoubleCheckingLockingSingleton();
            }
        }
        return instance;
    }
}
