package org.design.pattern.command.service;

import org.design.pattern.command.model.dish.Dish;

/**
 * 点餐服务接口
 */
public interface OrderService {

    /**
     * 点菜
     * @param dish 菜
     */
    void order(Dish dish);

    /**
     * 下单
     */
    void placeOrder();
}
