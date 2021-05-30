package org.design.pattern.state.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.state.model.PomodoroState;
import org.design.pattern.state.model.impl.RestPomodoroState;
import org.design.pattern.state.model.impl.WorkPomodoroState;
import org.design.pattern.state.service.PomodoroService;

/**
 * 番茄工作法服务实现类
 */
@Slf4j
public class PomodoroServiceImpl implements PomodoroService {

    /**
     * 开启一次番茄
     */
    @Override
    public void openPomodoro() {
        // 番茄-工作时间
        PomodoroState workState = new WorkPomodoroState();
        log.info("开启一次番茄时间");
        workState.work();
        log.info("工作时间想休息");
        workState.rest();
        log.info("工作时间结束");
        // 番茄-休息时间
        PomodoroState restState = new RestPomodoroState();
        restState.rest();
        log.info("休息时间想工作");
        restState.work();
        log.info("休息时间结束，准备好开始下一个番茄了嘛？");
     }
}
