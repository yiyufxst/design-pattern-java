package org.design.pattern.facade.utils;

import org.design.pattern.facade.text.ASCIIStrCache;

/**
 * 字符工具类
 */
public class CharUtil {

    /**
     * 给定对象对应的类是否为字符类，字符类包括：
     * Character.class
     * char.class
     *
     * @param value 被检查的对象
     * @return true表示为字符类
     */
    public static boolean isChar(Object value) {
        // noinspection ConstantConditions
        return value instanceof Character || value.getClass() == char.class;
    }

    /**
     * 字符转为字符串
     * 如果为ASCII字符，使用缓存
     *
     * @param c 字符
     * @return 字符串
     */
    public static String toString(char c) {
        return ASCIIStrCache.toString(c);
    }
}
