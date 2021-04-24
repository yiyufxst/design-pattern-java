package org.design.pattern.command.model.cook;

/**
 * 厨师接口
 */
public interface Cook {

    /**
     * 做饭
     * @param dishName 菜名
     */
    void cooking(String dishName);
}
