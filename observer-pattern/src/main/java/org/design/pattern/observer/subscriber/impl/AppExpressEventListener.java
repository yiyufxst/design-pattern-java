package org.design.pattern.observer.subscriber.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.observer.subscriber.ExpressEventSubscriber;
import org.design.pattern.observer.model.Express;

/**
 * App-快递事件订阅者
 */
@Slf4j
public class AppExpressEventListener implements ExpressEventSubscriber {

    /**
     * 快递到达
     *
     * @param express 快递
     */
    @Override
    public void arrive(Express express) {
        log.info("App 通知：您的包裹{}已达到蜂站！", express.getId());
    }
}
