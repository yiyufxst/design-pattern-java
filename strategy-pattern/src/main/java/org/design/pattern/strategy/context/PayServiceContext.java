package org.design.pattern.strategy.context;

import org.design.pattern.strategy.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付服务Context
 */
@Component
public class PayServiceContext {

    /**
     * 支付服务map
     */
    @Autowired
    private final Map<String, PayService> strategyPayServiceMap = new ConcurrentHashMap<>();

    /**
     * 获取支付服务
     *
     * @param id 服务id
     * @return PayService
     */
    public PayService getPayService(String id) {
        PayService payService = this.strategyPayServiceMap.get(id);
        if (ObjectUtils.isEmpty(payService)) {
            throw new IllegalArgumentException("no such " + id + " PayService");
        }
        return payService;
    }
}
