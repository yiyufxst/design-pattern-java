package org.design.pattern.vistor.model.product.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.vistor.model.investor.InvestorVisitor;
import org.design.pattern.vistor.model.product.InvestmentProduct;

/**
 * 股票产品
 */
@Slf4j
public class Stock extends InvestmentProduct {

    /**
     * 市盈率
     */
    private Double pe;

    /**
     * 净利润同比
     */
    private Double profitYoy;

    /**
     * 构造方法
     *
     * @param code 个股代码
     * @param name 个股名称
     * @param pe 市盈率
     * @param profitYoy 净利润同比
     */
    public Stock(String code, String name, Double pe, Double profitYoy) {
        super(code, name);
        this.pe = pe;
        this.profitYoy = profitYoy;
    }

    /**
     * 获取市盈率情况
     */
    public void getPEPosition() {
        String pePosition;
        if (pe > 50) {
            pePosition = "高估值";
        } else if (pe < 0) {
            pePosition = "估值亏损";
        } else {
            pePosition = "低估值";
        }
        log.info("个股{}市盈率为{}, 处于{}", this.getName(), pe, pePosition);
    }

    /**
     * 获取净利润情况
     */
    public void getProfitPosition() {
        String profitPosition;
        if (profitYoy > 50) {
            profitPosition = "业绩上涨";
        } else if (profitYoy < 0) {
            profitPosition = "业绩下跌";
        } else {
            profitPosition = "业绩一般";
        }
        log.info("个股{}净利润同比增长为{}%, {}", this.getName(), profitYoy, profitPosition);
    }

    /**
     * 接收方法
     *
     * @param investorVisitor 投资访问者
     */
    @Override
    public void accept(InvestorVisitor investorVisitor) {
        investorVisitor.visit(this);
    }
}
