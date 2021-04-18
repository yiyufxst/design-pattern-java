package org.design.pattern.chain.impl;

import lombok.extern.slf4j.Slf4j;
import org.design.pattern.chain.Middleware;

/**
 * 用户存在中间件
 */
@Slf4j
public class UserExistMiddleware extends Middleware {

    /**
     * 验证
     *
     * @param userId 用户id
     * @param email 邮箱
     * @return boolean
     */
    @Override
    public boolean auth(String userId, String email) {
        // 模拟验证用户不存在
        if (!userId.equals("yiyufxst")) {
            log.error("用户{}不存在", userId);
            return false;
        }

        return super.auth(userId, email);
    }
}
