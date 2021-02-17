package org.design.pattern.builder.singleton;

import org.apache.commons.lang3.ObjectUtils;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS「AtomicReference」单例模式（线程安全）
 */
public class CompareAndSwapSingleton {
    private static final AtomicReference<CompareAndSwapSingleton> INSTANCE = new AtomicReference<CompareAndSwapSingleton>();

    private static CompareAndSwapSingleton instance;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private CompareAndSwapSingleton() {
    }

    public static final CompareAndSwapSingleton getInstance() {
        for (; ; ) {
            CompareAndSwapSingleton instance = INSTANCE.get();
            if (ObjectUtils.isNotEmpty(instance)) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new CompareAndSwapSingleton());
            return INSTANCE.get();
        }
    }
}
