package com.zzx.example.provider;

import com.zzx.example.common.service.UserService;
import com.zzx.example.common.model.User;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:48
 * @Description: com.zzx.example.provider
 * @version: 1.0
 * 用户服务实现类
 */
public class UserServiceImpl implements UserService {
    /**
     * 用户实现类
     */
    public User getUser(User user) {
        System.out.println("用户名：" +user.getName());
        user.setName(user.getName()+"zyk");

        return user;
    }
}
