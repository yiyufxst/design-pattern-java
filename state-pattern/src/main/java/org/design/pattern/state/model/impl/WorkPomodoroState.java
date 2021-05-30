package org.design.pattern.state.model.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.state.model.PomodoroState;

/**
 * 番茄-工作状态
 */
@Slf4j
public class WorkPomodoroState implements PomodoroState {

    /**
     * 工作
     */
    @Override
    public void work() {
        log.info("工作中：请保持高度集中！");
    }

    /**
     * 休息
     */
    @Override
    public void rest() {
        log.info("工作状态中断：该番茄钟作废！");
    }
}
