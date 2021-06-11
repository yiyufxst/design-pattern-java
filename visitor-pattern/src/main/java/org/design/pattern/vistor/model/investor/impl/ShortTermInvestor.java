package org.design.pattern.vistor.model.investor.impl;

import org.design.pattern.vistor.model.investor.InvestorVisitor;
import org.design.pattern.vistor.model.product.impl.Fund;
import org.design.pattern.vistor.model.product.impl.Stock;

/**
 * 短线投资者
 */
public class ShortTermInvestor implements InvestorVisitor {

    /**
     * 访问基金信息
     *
     * @param fund 基金
     */
    @Override
    public void visit(Fund fund) {
        fund.getManagerRecord();
    }

    /**
     * 访问股票信息
     *
     * @param stock 股票
     */
    @Override
    public void visit(Stock stock) {
        stock.getProfitPosition();
    }
}
