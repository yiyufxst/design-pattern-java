package org.design.pattern.bridge.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * QQApi
 */
public class QqApi implements LoginApi {
    private final Logger log = LoggerFactory.getLogger(LoginApi.class);

    private String $loginApi;

    private String $apiKey;

    public QqApi(String $loginApi, String $apiKey) {
        this.$loginApi = $loginApi;
        this.$apiKey = $apiKey;
    }

    @Override
    public boolean login() {
        log.info("QQ登录成功");
        return true;
    }
}
