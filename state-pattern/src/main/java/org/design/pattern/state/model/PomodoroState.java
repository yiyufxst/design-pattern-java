package org.design.pattern.state.model;

/**
 * 番茄状态接口
 */
public interface PomodoroState {

    /**
     * 工作
     */
    void work();

    /**
     * 休息
     */
    void rest();
}
