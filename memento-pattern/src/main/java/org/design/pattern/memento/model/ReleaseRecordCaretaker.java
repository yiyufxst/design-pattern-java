package org.design.pattern.memento.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 发布记录负责人
 */
public class ReleaseRecordCaretaker {

    /**
     * 发布记录历史记录列表
     */
    private List<ReleaseRecordMemento> mementoList = new ArrayList<>();

    /**
     * 发布历史记录map（可根据发布记录id查询）
     */
    private Map<Integer, ReleaseRecordMemento> mementoMap = new HashMap<>();

    /**
     * 存放发布记录
     *
     * @param releaseRecordMemento 发布记录备忘录
     */
    public void push(ReleaseRecordMemento releaseRecordMemento) {
        mementoList.add(releaseRecordMemento);
        mementoMap.put(releaseRecordMemento.getReleaseRecord().getId(), releaseRecordMemento);
    }

    /**
     * 回滚
     *
     * @return ReleaseRecordMemento
     */
    public ReleaseRecordMemento undo() {
        if (ObjectUtils.isEmpty(mementoList)) {
            return null;
        }
        return mementoList.get(mementoList.size() - 1);
    }

    /**
     * 根据发布记录id回滚
     *
     * @param releaseRecordId 发布记录id
     * @return ReleaseRecordMemento
     */
    public ReleaseRecordMemento undo(Integer releaseRecordId) {
        if (ObjectUtils.isEmpty(mementoMap) || ObjectUtils.isEmpty(mementoMap.get(releaseRecordId))) {
            return null;
        }
        return mementoMap.get(releaseRecordId);
    }
}
