package com.ql.utils;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy;
import org.objenesis.strategy.StdInstantiatorStrategy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: quliang
 * @create: 2022-10-20 15:18
 **/

public class KryoSerializer implements Serializer {
    private static final ThreadLocal<Kryo> kryoThreadLocal = ThreadLocal.withInitial(() -> {
        Kryo kryo = new Kryo();
        kryo.setReferences(true);
        kryo.setRegistrationRequired(false);
        ((DefaultInstantiatorStrategy) kryo.getInstantiatorStrategy())
                .setFallbackInstantiatorStrategy(new StdInstantiatorStrategy());
        return kryo;
    });

    @Override
    public byte[] serialize(Object obj) throws Exception {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Output output = new Output(baos);
            Kryo kryo = kryoThreadLocal.get();
            kryo.writeObject(output, obj);
            kryoThreadLocal.remove();
            return output.toBytes();
        } catch (IOException e) {
            throw new Exception("序列化失败", e);
        }
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) throws Exception {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
            Input input = new Input(bais);
            Kryo kryo = kryoThreadLocal.get();
            Object obj = kryo.readObject(input, clazz);
            kryoThreadLocal.remove();
            return clazz.cast(obj);
        } catch (IOException e) {
            throw new Exception("反序化失败");
        }
    }
}
