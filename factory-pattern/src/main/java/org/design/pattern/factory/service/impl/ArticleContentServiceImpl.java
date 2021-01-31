package org.design.pattern.factory.service.impl;

import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.design.pattern.factory.model.content.Article;
import org.design.pattern.factory.model.Content;
import org.design.pattern.factory.service.ContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

/**
 * 文章内容服务实现类
 */
public class ArticleContentServiceImpl implements ContentService {
    private final Logger log = LoggerFactory.getLogger(ArticleContentServiceImpl.class);

    @Override
    public Content createContent(String taskId, String userId, Map<String, Object> dataMap) throws InvocationTargetException, IllegalAccessException {
        log.info("task {} => start", taskId);
        log.info("task {} => article data is {}", taskId, JSON.toJSON(dataMap));
        //初始化
        Article result = new Article();
        result.setId(UUID.randomUUID().toString());
        result.setUserId(userId);
        //转换dataMap数据
        BeanUtils.populate(result, dataMap);
        log.info("task {} => create article success, id:{}, title:{}", taskId, result.getId(), result.getTitle());
        return result;
    }
}
