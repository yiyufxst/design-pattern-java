package org.design.pattern.state.test;

import org.design.pattern.state.service.PomodoroService;
import org.design.pattern.state.service.impl.PomodoroServiceImpl;
import org.junit.Test;

/**
 * 番茄工作法测试类
 */
public class PomodoroTest {

    @Test
    public void test() {
        PomodoroService pomodoroService = new PomodoroServiceImpl();
        pomodoroService.openPomodoro();
    }
}
