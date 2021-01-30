package org.design.pattern.factory;

import org.design.pattern.factory.service.ArticleContentServiceImpl;
import org.design.pattern.factory.service.ContentService;
import org.design.pattern.factory.service.LiveContentServiceImpl;
import org.design.pattern.factory.service.VideoContentServiceImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 内容工厂
 */
public class ContentServiceFactory {
    private static final Map<String, ContentService> factoryMap = new ConcurrentHashMap<String, ContentService>();

    static {
        factoryMap.put(ContentNum.ARTICLE.getType(), new ArticleContentServiceImpl());
        factoryMap.put(ContentNum.VIDEO.getType(), new VideoContentServiceImpl());
        factoryMap.put(ContentNum.LIVE.getType(), new LiveContentServiceImpl());
    }

    /**
     * 获取内容服务
     * @param type 内容类型
     * @return 内容服务实例
     */
    public ContentService getContentService(String type) {
        return factoryMap.get(type);
    }
}
