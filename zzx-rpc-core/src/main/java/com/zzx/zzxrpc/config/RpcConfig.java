package com.zzx.zzxrpc.config;
import lombok.Data;
/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 22:42
 * @Description: com.zzx.zzxrpc.config
 * @version: 1.0
 */



/**
 * RPC 框架配置
 */
@Data
public class RpcConfig {

    /**
     * 名称
     */
    private String name = "zzx-rpc";

    /**
     * 版本号
     */
    private String version = "1.0";

    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";

    /**
     * 服务器端口号
     */
    private Integer serverPort = 8080;

}

