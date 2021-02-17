package org.design.pattern.builder.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类单例实现
 */
public class StaticSingleton {
    public static Map<String,String> hashMap = new ConcurrentHashMap<String, String>();
}
