package org.design.pattern.observer.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.observer.model.Express;
import org.design.pattern.observer.publisher.ExpressEventPublisher;
import org.design.pattern.observer.service.ExpressService;

/**
 * 快递服务实现类
 */
@Slf4j
public class ExpressServiceImpl implements ExpressService {

    /**
     * 快递事件发布者
     */
    private final ExpressEventPublisher expressEventPublisher;

    /**
     * 构造方法
     *
     * @param expressEventPublisher 快递事件发布者
     */
    public ExpressServiceImpl(ExpressEventPublisher expressEventPublisher) {
        this.expressEventPublisher = expressEventPublisher;
    }

    /**
     * 快递到达
     *
     * @param express 快递
     */
    @Override
    public void arrive(Express express) {
        log.info("{}的快递已到达蜂站！", express.getRecipientName());
        expressEventPublisher.notifySubscribersArrive(express);
    }
}
