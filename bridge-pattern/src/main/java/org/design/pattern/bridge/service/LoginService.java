package org.design.pattern.bridge.service;

import org.design.pattern.bridge.model.LoginApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 登录服务
 */
public abstract class LoginService {
    protected final Logger log = LoggerFactory.getLogger(LoginService.class);

    protected LoginApi loginApi;

    public LoginService(LoginApi loginApi) {
        this.loginApi = loginApi;
    }

    public abstract boolean login();
}
