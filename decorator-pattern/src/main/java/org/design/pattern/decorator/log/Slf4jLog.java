package org.design.pattern.decorator.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j 日志
 */
public class Slf4jLog implements Log {

    /**
     * 日志记录对象
     */
    private final Logger log = LoggerFactory.getLogger("system_log");

    /**
     * 记录调试日志
     *
     * @param message 信息
     */
    @Override
    public void debug(String message) {
        if (log.isDebugEnabled()) {
             log.debug(message);
        }
    }

    /**
     * 记录普通日志
     *
     * @param message 信息
     */
    @Override
    public void info(String message) {
        if (log.isInfoEnabled()) {
              log.info(message);
        }
    }

    /**
     * 记录警告日志
     *
     * @param message 信息
     */
    @Override
    public void warn(String message) {
        if (log.isWarnEnabled()) {
            log.warn(message);
        }
    }

    /**
     * 记录错误日志
     *
     * @param message 信息
     */
    @Override
    public void error(String message) {
        if (log.isErrorEnabled()) {
            log.error(message);
        }
    }
}
