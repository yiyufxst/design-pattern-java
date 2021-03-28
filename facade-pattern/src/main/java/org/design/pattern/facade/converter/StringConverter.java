package org.design.pattern.facade.converter;

import org.design.pattern.facade.utils.ArrayUtil;
import org.design.pattern.facade.utils.CharUtil;

/**
 * 字符串转换器
 */
public class StringConverter {

    /**
     * 数据转为String
     * 转换规则为：
     * 1、字符串类型将被强转
     * 2、数组将被转换为逗号分隔的字符串
     * 3、其它类型将调用默认的toString()方法
     *
     * @param value 数据
     * @return String
     */
    public static String convertToStr(Object value) {
        if (null == value) {
            return null;
        }
        if (value instanceof CharSequence) {
            return value.toString();
        } else if (ArrayUtil.isArray(value)) {
            return ArrayUtil.toString(value);
        } else if(CharUtil.isChar(value)) {
            //对于ASCII字符使用缓存加速转换，减少空间创建
            return CharUtil.toString((char)value);
        }
        return value.toString();
    }
}
