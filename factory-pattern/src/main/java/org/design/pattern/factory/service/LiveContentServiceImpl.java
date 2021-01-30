package org.design.pattern.factory.service;

import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.design.pattern.factory.model.ContentBase;
import org.design.pattern.factory.model.Live;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

/**
 * 直播内容服务实现类
 */
public class LiveContentServiceImpl implements ContentService {
    private final Logger log = LoggerFactory.getLogger(LiveContentServiceImpl.class);

    @Override
    public ContentBase createContent(String taskId, String userId, Map<String, Object> dataMap) throws InvocationTargetException, IllegalAccessException {
        log.info("task {} => start", taskId);
        log.info("task {} => live data is {}", taskId, JSON.toJSON(dataMap));
        //初始化
        Live result = new Live();
        result.setId(UUID.randomUUID().toString());
        result.setUserId(userId);
        //转换dataMap数据
        BeanUtils.populate(result, dataMap);
        log.info("task {} => create live success, id:{}, title:{}", taskId, result.getId(), result.getTitle());
        return null;
    }
}
