package org.design.pattern.bridge.service.impl;

import org.design.pattern.bridge.model.LoginApi;
import org.design.pattern.bridge.service.LoginService;

/**
 * 登录服务实现类
 */
public class LoginServiceImpl extends LoginService {
    public LoginServiceImpl(LoginApi loginApi) {
        super(loginApi);
    }

    @Override
    public boolean login() {
        return this.loginApi.login();
    }
}
