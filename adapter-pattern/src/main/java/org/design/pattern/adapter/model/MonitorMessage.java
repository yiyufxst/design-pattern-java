package org.design.pattern.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 监控消息
 */
@Getter
@Setter
@AllArgsConstructor
public class MonitorMessage {
    /**
     * 标题
     */
    private String title;

    /**
     * 消息
     */
    private String message;
}
