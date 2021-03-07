package org.design.pattern.bridge.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微信Api
 */
public class WxApi implements LoginApi {
    private final Logger log = LoggerFactory.getLogger(LoginApi.class);

    private String $loginApi;

    private String $apiKey;

    public WxApi(String $loginApi, String $apiKey) {
        this.$loginApi = $loginApi;
        this.$apiKey = $apiKey;
    }

    @Override
    public boolean login() {
        log.info("微信登录成功");
        return true;
    }
}
