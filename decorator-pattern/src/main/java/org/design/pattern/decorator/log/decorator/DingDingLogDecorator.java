package org.design.pattern.decorator.log.decorator;

import org.design.pattern.decorator.log.Log;

/**
 * 钉钉日志装饰器
 */
public class DingDingLogDecorator extends LogDecorator {

    /**
     * 构造方法
     *
     * @param log 日志类
     */
    public DingDingLogDecorator(Log log) {
        super(log);
    }

    /**
     * 记录警告日志
     *
     * @param message 信息
     */
    @Override
    public void warn(String message) {
        log.warn(message);
        send(message);
    }

    /**
     * 记录错误日志
     *
     * @param message 信息
     */
    @Override
    public void error(String message) {
        log.error(message);
        send(message);
    }

    /**
     * 发送顶顶消息
     *
     * @param message 信息
     */
    public void send(String message) {
        //模拟邮件发送
        log.info("钉钉消息已发送，信息：" + message);
    }
}
