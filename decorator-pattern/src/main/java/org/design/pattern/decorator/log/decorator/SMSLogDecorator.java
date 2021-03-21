package org.design.pattern.decorator.log.decorator;

import org.design.pattern.decorator.log.Log;

/**
 * 短信日志装饰器
 */
public class SMSLogDecorator extends LogDecorator {

    /**
     * 构造方法
     *
     * @param log 日志类
     */
    public SMSLogDecorator(Log log) {
        super(log);
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
     * 发送短信
     *
     * @param message 信息
     */
    public void send(String message) {
        //模拟短信发送
        log.info("短信已发送，信息：" + message);
    }
}
