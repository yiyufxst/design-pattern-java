package org.design.pattern.command.service.impl;

import org.design.pattern.command.model.dish.Dish;
import org.design.pattern.command.service.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * 点餐服务实现类
 */
public class OrderServiceImpl implements OrderService {

    private List<Dish> dishList = new ArrayList<>();

    /**
     * 点菜
     *
     * @param dish 菜
     */
    @Override
    public void order(Dish dish) {
        dishList.add(dish);
    }

    /**
     * 下单
     */
    @Override
    public synchronized void placeOrder() {
        for (Dish dish : dishList) {
            dish.cook();
        }
        dishList.clear();
    }
}
