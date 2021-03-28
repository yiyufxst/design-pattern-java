package org.design.pattern.facade.test;

import org.design.pattern.facade.convert.Convert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 转换测试类
 */
public class ConvertTest {

    private final Logger log = LoggerFactory.getLogger(ConvertTest.class);

    @Test
    public void testConvertString() {
        int number = 1;
        log.info("int number = 1 convert string : " + Convert.toString(number));
        char charString = 'a';
        log.info("char charString = 'a' convert string : " + Convert.toString(charString));
        long[] array = {1,2,3,4,5};
        log.info("long[] array = {1,2,3,4,5} convert string : " + Convert.toString(array));
    }
}
