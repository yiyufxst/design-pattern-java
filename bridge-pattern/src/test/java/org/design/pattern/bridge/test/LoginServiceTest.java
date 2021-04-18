package org.design.pattern.bridge.test;

import org.design.pattern.bridge.model.LoginApi;
import org.design.pattern.bridge.model.QqApi;
import org.design.pattern.bridge.model.WxApi;
import org.design.pattern.bridge.service.LoginService;
import org.design.pattern.bridge.service.impl.LoginServiceImpl;
import org.junit.Test;

public class LoginServiceTest {
    @Test
    public void testLogin() {
        //微信登录
        LoginApi wxApi = new WxApi("https://mp.weixin.qq.com", "xxx");
        LoginService wxLoginService = new LoginServiceImpl(wxApi);
        wxLoginService.login();
        //QQ登录
        LoginApi qqApi = new QqApi("https://www.qq.com", "xx");
        LoginService qqLoginService = new LoginServiceImpl(qqApi);
        qqLoginService.login();
    }
}
