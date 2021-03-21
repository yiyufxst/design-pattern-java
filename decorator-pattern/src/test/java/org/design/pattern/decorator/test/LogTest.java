package org.design.pattern.decorator.test;

import org.design.pattern.decorator.log.*;
import org.design.pattern.decorator.log.decorator.DingDingLogDecorator;
import org.design.pattern.decorator.log.decorator.MailLogDecorator;
import org.design.pattern.decorator.log.decorator.SMSLogDecorator;
import org.junit.Test;

/**
 * 日志测试类
 */
public class LogTest {

    /**
     * 测试日志装饰器
     */
    @Test
    public void testLogDecorator() {
        Log log = new SMSLogDecorator(new DingDingLogDecorator(new MailLogDecorator(new Slf4jLog())));
        log.debug("系统调试开启");
        log.info("系统正常运行");
        log.warn("数据为空警告");
        log.error("mongo 连接错误");
    }
}
