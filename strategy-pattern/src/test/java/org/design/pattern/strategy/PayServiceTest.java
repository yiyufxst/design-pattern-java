package org.design.pattern.strategy;

import org.design.pattern.strategy.context.PayServiceContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class PayServiceTest {

    /**
     * 支付服务Context
     */
    @Autowired
    private PayServiceContext payServiceContext;

    @Test
    public void test() {
        // 微信支付
        this.payServiceContext.getPayService("WeChartPayService").payBill(100);
        // 支付宝支付
        this.payServiceContext.getPayService("AliPayService").payBill(200);
        // 银行卡支付
        this.payServiceContext.getPayService("BankCardPayService").payBill(300);
    }
}
