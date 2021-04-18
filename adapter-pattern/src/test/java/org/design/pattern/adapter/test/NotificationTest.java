package org.design.pattern.adapter.test;

import org.design.pattern.adapter.model.DingDingApi;
import org.design.pattern.adapter.model.MonitorMessage;
import org.design.pattern.adapter.service.NotificationService;
import org.design.pattern.adapter.service.impl.DingDingNotificationServiceImpl;
import org.design.pattern.adapter.service.impl.EmailNotificationServiceImpl;
import org.junit.Test;

/**
 * 通知测试类
 */
public class NotificationTest {
    @Test
    public void testNotification() {
        MonitorMessage monitorMessage = new MonitorMessage("获取mongo数据失败", "错误信息：xxxx");
        //邮件通知
        NotificationService emailNotificationService = new EmailNotificationServiceImpl();
        emailNotificationService.send(monitorMessage);
        //钉钉通知
        DingDingApi dingDingApi = new DingDingApi("https://www.dingtalk.com/", "xxx");
        NotificationService dingDingNotificationService = new DingDingNotificationServiceImpl(dingDingApi, "1");
        dingDingNotificationService.send(monitorMessage);
    }
}
