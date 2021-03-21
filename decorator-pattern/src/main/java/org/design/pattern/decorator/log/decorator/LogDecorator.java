package org.design.pattern.decorator.log.decorator;

import org.design.pattern.decorator.log.Log;

/**
 * 日志装饰器
 */
public class LogDecorator implements Log {

    /**
     * 日志类
     */
    protected Log log;

    /**
     * 构造方法
     *
     * @param log 日志类
     */
    public LogDecorator(Log log) {
        this.log = log;
    }

    /**
     * 记录调试日志
     *
     * @param message 信息
     */
    @Override
    public void debug(String message) {
        log.debug(message);
    }

    /**
     * 记录普通日志
     *
     * @param message 信息
     */
    @Override
    public void info(String message) {
        log.info(message);
    }

    /**
     * 记录警告日志
     *
     * @param message 信息
     */
    @Override
    public void warn(String message) {
        log.warn(message);
    }

    /**
     * 记录错误日志
     *
     * @param message 信息
     */
    @Override
    public void error(String message) {
        log.error(message);
    }
}
