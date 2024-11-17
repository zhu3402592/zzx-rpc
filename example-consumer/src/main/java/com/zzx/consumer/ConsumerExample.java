package com.zzx.consumer;

import com.zzx.zzxrpc.config.RpcConfig;
import com.zzx.zzxrpc.utils.ConfigUtils;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 22:54
 * @Description: com.zzx.consumer
 * @version: 1.0
 */
public class ConsumerExample {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
