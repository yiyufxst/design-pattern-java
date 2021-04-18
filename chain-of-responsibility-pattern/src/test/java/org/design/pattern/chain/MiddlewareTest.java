package org.design.pattern.chain;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.chain.impl.AccountActivatedMiddleware;
import org.design.pattern.chain.impl.InputLegalMiddleware;
import org.design.pattern.chain.impl.UserExistMiddleware;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class MiddlewareTest {

    @Test
    public void testMiddleware() {
        // 输入合法 -> 用户存在 -> 账户已激活
        Middleware loginAuth = new InputLegalMiddleware().setNext(
                new UserExistMiddleware().setNext(new AccountActivatedMiddleware())
        );
        boolean isLogin = loginAuth.auth("yiyu", "");
        Assert.assertFalse(isLogin);
        isLogin = loginAuth.auth("yiyu", "xx");
        Assert.assertFalse(isLogin);
        isLogin = loginAuth.auth("yiyufxst", "yiyufxst@xx.com");
        Assert.assertFalse(isLogin);
        String userId = "yiyufxst";
        String email = "yiyufxst@qq.com";
        isLogin = loginAuth.auth(userId, email);
        Assert.assertTrue(isLogin);
        log.info("用户{}，邮箱{}已激活，可正常使用", userId, email);
    }
}
