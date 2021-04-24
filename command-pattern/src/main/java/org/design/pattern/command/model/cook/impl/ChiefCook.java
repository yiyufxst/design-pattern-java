package org.design.pattern.command.model.cook.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.command.model.cook.Cook;

/**
 * 主厨
 */
@Slf4j
public class ChiefCook implements Cook {

    /**
     * 做饭
     *
     * @param dishName 菜名
     */
    @Override
    public void cooking(String dishName) {
        log.info("主厨制作{}", dishName);
    }
}
