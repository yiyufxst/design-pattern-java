package org.design.pattern.vistor.model.investor.impl;

import org.design.pattern.vistor.model.investor.InvestorVisitor;
import org.design.pattern.vistor.model.product.impl.Fund;
import org.design.pattern.vistor.model.product.impl.Stock;

/**
 * 长线投资者
 */
public class LongTermInvestor implements InvestorVisitor {

    /**
     * 访问基金信息
     *
     * @param fund 基金
     */
    @Override
    public void visit(Fund fund) {
        fund.getHistoryRetreatRatePosition();
    }

    /**
     * 访问股票信息
     *
     * @param stock 股票
     */
    @Override
    public void visit(Stock stock) {
        stock.getPEPosition();
    }
}
