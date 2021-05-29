package org.design.pattern.observer.publisher;

import org.design.pattern.observer.model.Express;
import org.design.pattern.observer.subscriber.ExpressEventSubscriber;
import java.util.ArrayList;
import java.util.List;

/**
 * 快递事件发布者
 */
public class ExpressEventPublisher {

    /**
     * 快递事件订阅者列表
     */
    private List<ExpressEventSubscriber> subscriberList = new ArrayList<>();

    /**
     * 订阅快递事件
     *
     * @param expressEventSubscriber 订阅者
     */
    public void subscribe(ExpressEventSubscriber expressEventSubscriber) {
        subscriberList.add(expressEventSubscriber);
    }

    /**
     * 取消订阅快递事件
     *
     * @param expressEventSubscriber 订阅者
     */
    public void unsubscribe(ExpressEventSubscriber expressEventSubscriber) {
        subscriberList.remove(expressEventSubscriber);
    }

    /**
     * 通知订阅者快递到达
     *
     * @param express 快递
     */
    public void notifySubscribersArrive(Express express) {
        subscriberList.forEach(expressEventSubscriber -> expressEventSubscriber.arrive(express));
    }
}
