package com.zzx.zzxrpc.server;


import io.vertx.core.Vertx;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 16:59
 * @Description: com.zzx.zzxrpc.server
 * @version: 1.0
 */
public class VertxHttpServer implements HttpServer {
    public void doStart(int port) {
        //创建 Vert.x实例
        Vertx vertx = Vertx.vertx();

        //创建HTTP服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        //监听端口并处理请求
//        server.requestHandler(request ->{
//            //处理请求
//            System.out.println("Received request:"+ request.method() + " "+request.uri());
//
//            //发送 HTTP 响应
//            request.response()
//                    .putHeader("content-type","text/plain")
//                    .end("Hello from Vert.x HTTP server!");
//        });
        server.requestHandler(new HttpServerHandler());

        //启动 HTTP 服务器并监听制定端口
        server.listen(port,result ->{
            if(result.succeeded()){
                System.out.println("Server is now listening on port " + port);
            }else {
                System.out.println("Failed to start server:"+ result.cause());
            }
        });

    }
}
