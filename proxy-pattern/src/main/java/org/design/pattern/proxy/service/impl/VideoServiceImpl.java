package org.design.pattern.proxy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.proxy.model.Video;
import org.design.pattern.proxy.service.VideoService;
import java.util.HashMap;

/**
 * 视频服务实现类
 */
@Slf4j
public class VideoServiceImpl implements VideoService {

    /**
     * 热门视频
     *
     * @return HashMap<String, Video
     */
    @Override
    public HashMap<String, Video> popularVideoList() throws InterruptedException {
        log.info("开始获取热门视频");
        // Mock获取视频列表较慢
        Thread.sleep(4000);
        // Mock视频列表数据
        HashMap<String, Video> videoHashMap = new HashMap<>();
        videoHashMap.put("1", new Video("1", "钢之炼金术师", "http://xx.com/video/1/"));
        videoHashMap.put("2", new Video("2", "刺客五六七", "http://xx.com/video/2/"));
        videoHashMap.put("3", new Video("3", "大鱼海棠", "http://xx.com/video/3/"));
        videoHashMap.put("4", new Video("4", "千与千寻", "http://xx.com/video/4/"));
        log.info("热门视频获取完毕");
        return videoHashMap;
    }

    /**
     * 获取视频内容
     *
     * @param id 视频id
     * @return Video
     */
    @Override
    public Video getVideo(String id) throws InterruptedException {
        log.info("获取视频{}", id);
        // Mock获取视频列表较慢
        Thread.sleep(2000);
        Video video = new Video(id, "镶金玫瑰", "http://xx.com/video/5/");
        log.info("视频{}获取完毕", id);
        return video;
    }
}
