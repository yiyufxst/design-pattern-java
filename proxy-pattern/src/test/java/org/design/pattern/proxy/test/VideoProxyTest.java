package org.design.pattern.proxy.test;

import org.design.pattern.proxy.VideoCacheProxy;
import org.design.pattern.proxy.service.VideoService;
import org.junit.Test;

/**
 * 视频代理缓存测试类
 */
public class VideoProxyTest {

    @Test
    public void testVideoProxy() throws InterruptedException {
        VideoService videoService = new VideoCacheProxy();
        videoService.popularVideoList();
        videoService.getVideo("1");
        videoService.popularVideoList();
        videoService.getVideo("1");
    }
}
