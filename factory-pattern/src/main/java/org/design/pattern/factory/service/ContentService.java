package org.design.pattern.factory.service;

import org.design.pattern.factory.model.ContentBase;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * 内容服务
 */
public interface ContentService {
    /**
     * 生产内容
     *  @param taskId 任务id
     * @param userId 用户id
     * @param dataMap 内容数据
     * @return 内容
     */
    ContentBase createContent(String taskId, String userId, Map<String, Object> dataMap) throws InvocationTargetException, IllegalAccessException;
}
