package com.zzx.zzxrpc.proxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 18:17
 * @Description: com.zzx.zzxrpc.proxy
 * @version: 1.0
 */
public class ServiceProxyFactory {

    /**
     * 根据服务类获取代理对象
     *
     * @param serviceClass
     * @param <T>
     * @return
     */
    public static <T> T getProxy(Class<T> serviceClass) {
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());
    }
}
