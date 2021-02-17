package org.design.pattern.builder.singleton;

/**
 * 静态内部类单例模式（线程安全）
 */
public class StaticInnerSingleton {
    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法
     */
    private StaticInnerSingleton(){
    }

    public static final StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
