package org.design.pattern.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.strategy.service.PayService;
import org.springframework.stereotype.Service;

/**
 * 支付宝支付服务实现类
 */
@Slf4j
@Service("AliPayService")
public class AliPayServiceImpl implements PayService {

    /**
     * 支付账单
     *
     * @param billAmount 账单金额
     */
    @Override
    public void payBill(Integer billAmount) {
        log.info("支付宝支付：您已支付{}元，请确认是否为本人操作", billAmount);
    }
}