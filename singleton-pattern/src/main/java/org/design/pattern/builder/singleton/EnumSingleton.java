package org.design.pattern.builder.singleton;

/**
 * 枚举单例（线程安全）
 */
public enum EnumSingleton {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("enum singleton method");
    }
}
