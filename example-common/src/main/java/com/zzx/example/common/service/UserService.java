package com.zzx.example.common.service;

import com.zzx.example.common.model.User;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:43
 * @Description: com.zzx.example.common
 * @version: 1.0
 * 用户服务
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);
}
