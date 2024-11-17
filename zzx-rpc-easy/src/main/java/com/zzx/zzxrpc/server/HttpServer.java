package com.zzx.zzxrpc.server;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 17:01
 * @Description: com.zzx.zzxrpc.server
 * @version: 1.0
 * HTTP 服务接口
 */
public interface HttpServer {

    /**
     * 启动服务
     * @param port
     */
     void doStart(int port);


}
