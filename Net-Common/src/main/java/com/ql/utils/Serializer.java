package com.ql.utils;

/**
 * @description:
 * @author: quliang
 * @create: 2022-10-20 15:16
 **/
public interface Serializer {
    /**
     * 序列化
     *
     * @param obj
     * @return
     * @throws Exception
     */
    byte[] serialize(Object obj) throws Exception;

    /**
     * 反序列化
     *
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T deserialize(byte[] bytes, Class<T> clazz) throws Exception;

}
