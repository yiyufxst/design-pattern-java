package org.design.pattern.vistor.model.investor;

import org.design.pattern.vistor.model.product.impl.Fund;
import org.design.pattern.vistor.model.product.impl.Stock;

/**
 * 投资访问者超类
 */
public interface InvestorVisitor {

    /**
     * 访问基金信息
     *
     * @param fund 基金
     */
    void visit(Fund fund);

    /**
     * 访问股票信息
     *
     * @param stock 股票
     */
    void visit(Stock stock);
}
