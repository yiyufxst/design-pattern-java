package org.design.pattern.memento.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 发布记录原生器
 */
@Getter
@Setter
public class ReleaseRecordOriginator {

    /**
     * 发布记录
     */
    private ReleaseRecord releaseRecord;

    /**
     * 构造函数
     *
     * @param releaseRecord 发布记录
     */
    public ReleaseRecordOriginator(ReleaseRecord releaseRecord) {
        this.releaseRecord = releaseRecord;
    }

    /**
     * 保存发布记录
     *
     * @return ReleaseRecordMemento
     */
    public ReleaseRecordMemento save() {
        return new ReleaseRecordMemento(this.releaseRecord);
    }

    /**
     * 恢复发布记录
     *
     * @param releaseRecordMemento 发布记录备忘录
     */
    public void restore(ReleaseRecordMemento releaseRecordMemento) {
        this.releaseRecord = releaseRecordMemento.getReleaseRecord();
    }
}
