package org.design.pattern.state.model.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.state.model.PomodoroState;

/**
 * 番茄-休息状态
 */
@Slf4j
public class RestPomodoroState implements PomodoroState {

    /**
     * 工作
     */
    @Override
    public void work() {
        log.info("良好的休息才是下一个番茄钟开始的必要条件！");
    }

    /**
     * 休息
     */
    @Override
    public void rest() {
        log.info("工作时间结束了，喝杯水，伸个懒腰，看看窗外！");
    }
}
