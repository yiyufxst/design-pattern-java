package org.design.pattern.chain.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.chain.Middleware;

/**
 * 验证账户激活中间件
 */
@Slf4j
public class AccountActivatedMiddleware extends Middleware {

    /**
     * 验证
     *
     * @param userId 用户id
     * @param email 邮箱
     * @return boolean
     */
    @Override
    public boolean auth(String userId, String email) {
        // 模拟邮箱未验证激活
        if (!email.equals("yiyufxst@qq.com")) {
            log.error("用户{}邮箱{}未激活", userId, email);
            return false;
        }

        return super.auth(userId, email);
    }
}
