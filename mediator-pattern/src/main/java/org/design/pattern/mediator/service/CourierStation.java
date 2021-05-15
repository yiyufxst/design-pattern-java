package org.design.pattern.mediator.service;

import org.design.pattern.mediator.model.ExpressPackage;

/**
 * 快递站
 */
public interface CourierStation {

    /**
     * 收件服务
     *
     * @param expressPackage 快递包裹
     */
    void receiveExpressPackage(ExpressPackage expressPackage);

    /**
     * 寄件服务
     *
     * @param expressPackage 快递包裹
     */
    void sendExpressPackage(ExpressPackage expressPackage);
}
