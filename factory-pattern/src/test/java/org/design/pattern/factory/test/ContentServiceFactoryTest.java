package org.design.pattern.factory.test;

import org.design.pattern.factory.ContentNum;
import org.design.pattern.factory.ContentServiceFactory;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ContentServiceFactoryTest {
    private final ContentServiceFactory contentServiceFactory = new ContentServiceFactory();

    @Test
    public void createArticle() throws InvocationTargetException, IllegalAccessException {
        String taskId = UUID.randomUUID().toString();
        String userId = "yiyufxst";
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("title", "初学设计模式：实战工厂模式");
        dataMap.put("content", "文章：「文章、视频、直播内容输出生产场景」");
        dataMap.put("partitionId", 1);
        dataMap.put("articleType", "技术");
        dataMap.put("topics", new ArrayList<String>(){
            {
                this.add("Java");
                this.add("设计模式");
            }
        });
        this.contentServiceFactory.getContentService(ContentNum.ARTICLE.getType()).createContent(taskId, userId, dataMap);
    }

    @Test
    public void createVideo() throws InvocationTargetException, IllegalAccessException {
        String taskId = UUID.randomUUID().toString();
        String userId = "yiyufxst";
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("title", "初学设计模式：实战工厂模式");
        dataMap.put("introduction", "视频：「文章、视频、直播多种内容输出生产场景」");
        dataMap.put("videoUrl", "//yiyufxst.me/av/1");
        dataMap.put("coverUrl", "//yiyufxst.me/images/1");
        dataMap.put("partitionId", 1);
        this.contentServiceFactory.getContentService(ContentNum.VIDEO.getType()).createContent(taskId, userId, dataMap);
    }

    @Test
    public void createLive() throws InvocationTargetException, IllegalAccessException {
        String taskId = UUID.randomUUID().toString();
        String userId = "yiyufxst";
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("title", "初学设计模式：实战工厂模式");
        dataMap.put("introduction", "直播：「文章、视频、直播多种内容输出生产场景」");
        dataMap.put("roomId", 1);
        dataMap.put("coverUrl", "//yiyufxst.me/images/2");
        dataMap.put("partitionId", 1);
        this.contentServiceFactory.getContentService(ContentNum.LIVE.getType()).createContent(taskId, userId, dataMap);
    }
}
