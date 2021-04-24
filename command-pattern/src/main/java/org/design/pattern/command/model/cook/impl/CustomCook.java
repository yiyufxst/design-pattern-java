package org.design.pattern.command.model.cook.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.command.model.cook.Cook;

/**
 * 普通厨师
 */
@Slf4j
public class CustomCook implements Cook {

    /**
     * 做饭
     *
     * @param dishName 菜名
     */
    @Override
    public void cooking(String dishName) {
        log.info("普通厨师制作{}", dishName);
    }
}
