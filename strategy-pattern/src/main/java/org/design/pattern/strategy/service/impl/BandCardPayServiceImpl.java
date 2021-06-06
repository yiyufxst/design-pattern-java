package org.design.pattern.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.strategy.service.PayService;
import org.springframework.stereotype.Service;

/**
 * 银行卡支付服务实现类
 */
@Slf4j
@Service("BankCardPayService")
public class BandCardPayServiceImpl implements PayService {

    /**
     * 支付账单
     *
     * @param billAmount 账单金额
     */
    @Override
    public void payBill(Integer billAmount) {
        log.info("银行卡支付：您已支付{}元，余额1000元，请确认是否为本人操作", billAmount);
    }
}