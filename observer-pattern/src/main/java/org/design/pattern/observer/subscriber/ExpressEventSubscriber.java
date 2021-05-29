package org.design.pattern.observer.subscriber;

import org.design.pattern.observer.model.Express;

/**
 * 快递事件订阅者
 */
public interface ExpressEventSubscriber {

    /**
     * 快递到达
     *
     * @param express 快递
     */
    void arrive(Express express);
}
