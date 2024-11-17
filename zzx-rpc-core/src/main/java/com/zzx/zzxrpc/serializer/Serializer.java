package com.zzx.zzxrpc.serializer;

import java.io.IOException;

/**
 * @Auther: zzx
 * @Date: 2024/11/16 - 11 - 16 - 17:54
 * @Description: com.zzx.zzxrpc.serializer
 * @version: 1.0
 * 序列化接口
 */
public interface Serializer {

    /**
     * 序列化
     *
     * @param object
     * @param <T>
     * @return
     * @throws IOException
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 反序列化
     *
     * @param bytes
     * @param type
     * @param <T>
     * @return
     * @throws IOException
     */
    <T> T deserialize(byte[] bytes, Class<T> type) throws IOException;
}
