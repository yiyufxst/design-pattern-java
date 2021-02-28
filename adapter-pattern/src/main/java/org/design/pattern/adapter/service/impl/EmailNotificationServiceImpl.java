package org.design.pattern.adapter.service.impl;

import org.design.pattern.adapter.model.MonitorMessage;
import org.design.pattern.adapter.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 邮件通知服务实现类
 */
public class EmailNotificationServiceImpl implements NotificationService {
    private final Logger log = LoggerFactory.getLogger(EmailNotificationServiceImpl.class);

    @Override
    public void send(MonitorMessage monitorMessage) {
        boolean sendResponse = mail(monitorMessage);
        if (sendResponse) {
            log.info("{} message send email success", monitorMessage.getTitle());
        } else {
            log.error("{} message send email failed", monitorMessage.getTitle());
        }
    }

    /**
     * 发送邮件
     * @param monitorMessage
     * @return
     */
    private boolean mail(MonitorMessage monitorMessage) {
        boolean result = true;
        // 发送邮件...
        return result;
    }
}
