package org.design.pattern.observer.test;

import org.design.pattern.observer.model.Express;
import org.design.pattern.observer.publisher.ExpressEventPublisher;
import org.design.pattern.observer.service.ExpressService;
import org.design.pattern.observer.service.impl.ExpressServiceImpl;
import org.design.pattern.observer.subscriber.ExpressEventSubscriber;
import org.design.pattern.observer.subscriber.impl.AppExpressEventListener;
import org.design.pattern.observer.subscriber.impl.SmsExpressEventSubscriber;
import org.junit.Test;

/**
 * 快递事件测试类
 */
public class ExpressEventTest {

    @Test
    public void test() {
        // 快递初始化
        Express express = new Express("1", "yiyufxst", "13245678910", "xx路");
        // 订阅者初始化
        ExpressEventSubscriber appExpressEventListener = new AppExpressEventListener();
        ExpressEventSubscriber smsExpressEventSubscriber = new SmsExpressEventSubscriber();
        // 发布者初始化
        ExpressEventPublisher expressEventPublisher = new ExpressEventPublisher();
        // 订阅快递事件
        expressEventPublisher.subscribe(appExpressEventListener);
        expressEventPublisher.subscribe(smsExpressEventSubscriber);
        // 快递服务类初始化
        ExpressService expressService = new ExpressServiceImpl(expressEventPublisher);
        // 快递到达
        expressService.arrive(express);
        // App取消订阅快递事件
        expressEventPublisher.unsubscribe(appExpressEventListener);
        // 模拟新快递
        express.setId("2");
        // 快递到达
        expressService.arrive(express);
    }
}
