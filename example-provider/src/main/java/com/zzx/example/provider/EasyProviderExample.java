package com.zzx.example.provider;

import com.zzx.example.common.service.UserService;
import com.zzx.zzxrpc.RpcApplication;
import com.zzx.zzxrpc.registry.LocalRegistry;
import com.zzx.zzxrpc.server.HttpServer;
import com.zzx.zzxrpc.server.VertxHttpServer;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:51
 * @Description: com.zzx.example.provider
 * @version: 1.0
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        RpcApplication.init();

        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //启动 web 服务
        HttpServer server =new VertxHttpServer();
        server.doStart(8080);
    }
}
