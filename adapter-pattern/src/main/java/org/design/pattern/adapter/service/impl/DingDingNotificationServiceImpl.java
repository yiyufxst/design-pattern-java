package org.design.pattern.adapter.service.impl;

import org.design.pattern.adapter.model.DingDingApi;
import org.design.pattern.adapter.model.MonitorMessage;
import org.design.pattern.adapter.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 钉钉通知服务实现类
 */
public class DingDingNotificationServiceImpl implements NotificationService {
    private final Logger log = LoggerFactory.getLogger(DingDingNotificationServiceImpl.class);

    /**
     * 钉钉Api
     */
    private DingDingApi dingDingApi;

    /**
     * 工作群id
     */
    private String chatId;

    public DingDingNotificationServiceImpl(DingDingApi dingDingApi, String chatId) {
        this.dingDingApi = dingDingApi;
        this.chatId = chatId;
    }

    @Override
    public void send(MonitorMessage monitorMessage) {
        this.dingDingApi.logIn();;
        boolean sendResponse = this.dingDingApi.sendMessage(monitorMessage.getMessage(), this.chatId);
        if (sendResponse) {
            log.info("{} send to chartId {} success", monitorMessage.getTitle(), this.chatId);
        } else {
            log.error("{} send to chartId {} failed", monitorMessage.getTitle(), this.chatId);
        }
    }
}
