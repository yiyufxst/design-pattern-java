package org.design.pattern.memento.test;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.design.pattern.memento.model.ReleaseRecord;
import org.design.pattern.memento.model.ReleaseRecordCaretaker;
import org.design.pattern.memento.model.ReleaseRecordOriginator;
import org.junit.Test;

/***
 * 备忘录模式测试类
 */
@Slf4j
public class MementoTest {

    @Test
    public void test() {
        ReleaseRecordCaretaker recordCaretaker = new ReleaseRecordCaretaker();

        ReleaseRecordOriginator recordOriginator = new ReleaseRecordOriginator(
                new ReleaseRecord(1, "0.1.0", "test-cloud", "yiyu", "tester")
        );
        recordCaretaker.push(recordOriginator.save());

        recordOriginator.setReleaseRecord(
            new ReleaseRecord(2, "0.1.1", "test-cloud", "yiyu", "tester")
        );
        recordCaretaker.push(recordOriginator.save());

        // 回滚
        recordOriginator.restore(recordCaretaker.undo());
        log.info("历史发布回滚：{}", JSON.toJSONString(recordOriginator.getReleaseRecord()));

        // 根据发布id回滚
        Integer undoReleaseRecordId = 1;
        recordOriginator.restore(recordCaretaker.undo(undoReleaseRecordId));
        log.info("回滚发布记录id为{}的发布：{}", undoReleaseRecordId, JSON.toJSONString(recordOriginator.getReleaseRecord()));
    }
}
