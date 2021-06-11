package org.design.pattern.vistor.test;

import org.design.pattern.vistor.model.investor.InvestorVisitor;
import org.design.pattern.vistor.model.investor.impl.LongTermInvestor;
import org.design.pattern.vistor.model.investor.impl.ShortTermInvestor;
import org.design.pattern.vistor.model.product.InvestmentProduct;
import org.design.pattern.vistor.model.product.impl.Fund;
import org.design.pattern.vistor.model.product.impl.Stock;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

/**
 * 测试类
 */
public class VisitorTest {

    @Test
    public void test() {
        List<InvestmentProduct> investmentProducts = Arrays.asList(
                new Fund("110011", "易方达中小盘混合", "张坤", "优秀", 15.12),
                new Fund("320007", "诺安成长混合", "蔡嵩松", "优秀", 35.17),
                new Stock("600519", "贵州茅台", 60.57, 6.57),
                new Stock("000002", "万科A", 7.37, 50.33)
        );
        InvestorVisitor shortTermInvestor = new ShortTermInvestor();
        System.out.println("短期投资者关注点：");
        investmentProducts.forEach(investmentProduct -> investmentProduct.accept(shortTermInvestor));
        InvestorVisitor longTermInvestor = new LongTermInvestor();
        System.out.println("长期投资者关注点：");
        investmentProducts.forEach(investmentProduct -> investmentProduct.accept(longTermInvestor));
    }
}
