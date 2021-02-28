package org.design.pattern.adapter.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 钉钉Api类
 */
public class DingDingApi {
    private final Logger log = LoggerFactory.getLogger(DingDingApi.class);

    private String $loginApi;

    private String $apiKey;

    public DingDingApi(String $loginApi, String $apiKey) {
        this.$loginApi = $loginApi;
        this.$apiKey = $apiKey;
    }

    /**
     * 登录
     */
    public void logIn() {
        log.info("登录钉钉账户成功");
    }

    /**
     *
     * @param message
     * @param charId
     * @return
     */
    public boolean sendMessage(String message, String charId) {
        boolean result = false;
        try {
            result = true;
            log.info("发送钉钉消息通知到群{}成功：{}", charId, message);
        } catch (Exception e) {
            log.error("发送钉钉通知失败：", e);
        }
        return result;
    }
}
