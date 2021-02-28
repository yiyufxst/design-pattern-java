package org.design.pattern.adapter.service;

import org.design.pattern.adapter.model.MonitorMessage;

/**
 * 通知服务接口
 */
public interface NotificationService {
    void send(MonitorMessage monitorMessage);
}
