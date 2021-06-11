package org.design.pattern.vistor.model.product.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.vistor.model.investor.InvestorVisitor;
import org.design.pattern.vistor.model.product.InvestmentProduct;

/**
 * 基金
 */
@Slf4j
public class Fund extends InvestmentProduct {

    /**
     * 基金经理
     */
    private String manager;

    /**
     * 基金经理战绩
     */
    private String managerRecord;

    /**
     * 基金历史最大回撤率
     */
    private Double historyRetreatRate;

    /**
     * 构造方法
     *
     * @param code 基金代码
     * @param name 基金名称
     * @param manager 基金经理
     * @param managerRecord 基金经理战绩
     * @param historyRetreatRate 易方达中小盘混合
     */
    public Fund(String code, String name, String manager, String managerRecord, Double historyRetreatRate) {
        super(code, name);
        this.manager = manager;
        this.managerRecord = managerRecord;
        this.historyRetreatRate = historyRetreatRate;
    }

    /**
     * 获取基金经理战绩
     */
    public void getManagerRecord() {
        log.info("基金{}经理为{}，历史战绩{}", getName(), manager, managerRecord);
    }

    /**
     * 获取历史最大回撤率情况
     */
    public void getHistoryRetreatRatePosition() {
        String retreatRatePosition;
        if (historyRetreatRate > 30) {
            retreatRatePosition = "风险较大";
        } else if (historyRetreatRate < 0) {
            retreatRatePosition = "风险低";
        } else {
            retreatRatePosition = "风险较低";
        }
        log.info("基金{}历史最大回撤率为{}%, {}", this.getName(), historyRetreatRate, retreatRatePosition);
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
