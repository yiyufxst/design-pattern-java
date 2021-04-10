package org.design.pattern.proxy.model;

import lombok.AllArgsConstructor;

/**
 * 视频
 */
@AllArgsConstructor
public class Video {

    /**
     * 视频 id
     */
    private String id;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频地址
     */
    private String url;
}
