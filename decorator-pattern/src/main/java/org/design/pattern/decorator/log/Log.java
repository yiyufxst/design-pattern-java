package org.design.pattern.decorator.log;

/**
 * 日志接口
 */
public interface Log {

    /**
     * 记录调试日志
     *
     * @param message 信息
     */
    void debug(String message);

    /**
     * 记录普通日志
     *
     * @param message 信息
     */
    void info(String message);

    /**
     * 记录警告日志
     *
     * @param message 信息
     */
    void warn(String message);

    /**
     * 记录错误日志
     *
     * @param message 信息
     */
    void error(String message);
}
