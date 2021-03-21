package org.design.pattern.decorator.log.decorator;

import org.design.pattern.decorator.log.Log;

/**
 * 邮件日志装饰器
 */
public class MailLogDecorator extends LogDecorator {

    /**
     * 构造方法
     *
     * @param log 日志类
     */
    public MailLogDecorator(Log log) {
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
        mail(message);
    }

    /**
     * 记录错误日志
     *
     * @param message 信息
     */
    @Override
    public void error(String message) {
        log.error(message);
        mail(message);
    }

    /**
     * 发送邮件
     *
     * @param message 信息
     */
    public void mail(String message) {
        //模拟邮件发送
        log.info("邮件已发送，信息：" + message);
    }
}
