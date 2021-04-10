package org.design.pattern.proxy.service;

import org.design.pattern.proxy.model.Video;
import java.util.HashMap;

/**
 * 视频服务
 */
public interface VideoService {

    /**
     * 热门视频
     *
     * @return HashMap<String, Video
     */
    HashMap<String, Video> popularVideoList() throws InterruptedException;

    /**
     * 获取视频内容
     *
     * @param id 视频id
     * @return Video
     */
    Video getVideo(String id) throws InterruptedException;
}
