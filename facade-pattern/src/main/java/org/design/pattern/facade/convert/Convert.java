package org.design.pattern.facade.convert;

import org.design.pattern.facade.converter.StringConverter;

/**
 * 类型转换
 */
public class Convert {
    /**
     * 转换为字符串
     * 如果给定的值为null，或者转换失败，返回null
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return String
     */
    public static String toString(Object value) {
        return StringConverter.convertToStr(value);
    }
}
