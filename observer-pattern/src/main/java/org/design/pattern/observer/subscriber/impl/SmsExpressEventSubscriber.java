package org.design.pattern.observer.subscriber.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.observer.subscriber.ExpressEventSubscriber;
import org.design.pattern.observer.model.Express;

/**
 * 短信-快递事件订阅者
 */
@Slf4j
public class SmsExpressEventSubscriber implements ExpressEventSubscriber {
    /**
     * 快递到达
     *
     * @param express 快递
     */
    @Override
    public void arrive(Express express) {
        log.info("短信通知：您的包裹{}已达到蜂站！", express.getId());
    }
}
