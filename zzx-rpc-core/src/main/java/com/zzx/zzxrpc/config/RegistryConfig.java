package com.zzx.zzxrpc.config;

import com.zzx.zzxrpc.registry.RegistryKeys;
import lombok.Data;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 22:51
 * @Description: com.zzx.zzxrpc.config
 * @version: 1.0
 * RPC 框架注册中心配置
 */
@Data
public class RegistryConfig {


    /**
     * 注册中心类别
     */
    private String registry = RegistryKeys.ETCD;

    /**
     * 注册中心地址
     */
    private String address = "http://localhost:2380";

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 超时时间（单位毫秒）
     */
    private Long timeout = 10000L;
}
