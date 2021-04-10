package org.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.design.pattern.proxy.model.Video;
import org.design.pattern.proxy.service.VideoService;
import org.design.pattern.proxy.service.impl.VideoServiceImpl;
import java.util.HashMap;

/**
 * 视频缓存代理
 */
@Slf4j
public class VideoCacheProxy implements VideoService {

    /**
     * 视频服务
     */
    private VideoService videoService;

    /**
     * 热门视频缓存列表
     */
    private HashMap<String, Video> cachePopularVideoList = new HashMap<>();

    /**
     * 视频缓存列表
     */
    private HashMap<String, Video> cacheVideoList = new HashMap<>();

    public VideoCacheProxy() {
        this.videoService = new VideoServiceImpl();
    }

    /**
     * 热门视频
     *
     * @return HashMap<String, Video
     */
    @Override
    public HashMap<String, Video> popularVideoList() throws InterruptedException {
        if (ObjectUtils.isEmpty(cachePopularVideoList)) {
            cachePopularVideoList = videoService.popularVideoList();
        } else {
            log.info("从缓存中获取热门视频");
        }
        return null;
    }

    /**
     * 获取视频内容
     *
     * @param id 视频id
     * @return Video
     */
    @Override
    public Video getVideo(String id) throws InterruptedException {
        Video video = cacheVideoList.get(id);
        if (ObjectUtils.isEmpty(video)) {
            video = videoService.getVideo(id);
            cacheVideoList.put(id, video);
        } else {
            log.info("从缓存中获取视频{}", id);
        }
        return video;
    }
}
