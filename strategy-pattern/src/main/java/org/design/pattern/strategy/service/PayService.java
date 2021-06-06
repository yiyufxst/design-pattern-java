package org.design.pattern.strategy.service;

/**
 * 支付服务接口
 */
public interface PayService {

    /**
     * 支付账单
     *
     * @param billAmount 账单金额
     */
    void payBill(Integer billAmount);
}
