package org.design.pattern.memento.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 发布记录备忘录
 */
@Getter
@Setter
public class ReleaseRecordMemento {

    /**
     * 发布记录
     */
    private ReleaseRecord releaseRecord;

    /**
     * 构造函数
     *
     * @param releaseRecord 发布记录
     */
    public ReleaseRecordMemento(ReleaseRecord releaseRecord) {
        this.releaseRecord = releaseRecord;
    }
}
