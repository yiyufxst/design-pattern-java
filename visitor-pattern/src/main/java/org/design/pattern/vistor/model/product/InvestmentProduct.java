package org.design.pattern.vistor.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.design.pattern.vistor.model.investor.InvestorVisitor;

/**
 * 投资产品超类
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class InvestmentProduct {

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 接收方法
     *
     * @param investorVisitor 投资访问者
     */
    public abstract void accept(InvestorVisitor investorVisitor);
}
