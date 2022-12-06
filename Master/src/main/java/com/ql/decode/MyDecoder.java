package com.ql.decode;

import com.ql.protocol.Header;
import com.ql.protocol.Message;
import com.ql.utils.KryoSerializer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-25 01:39
 **/
@Slf4j
public class MyDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        Header header = new Header();

        header.setCrcCode(in.readInt());
        header.setSessionId(in.readLong());
        header.setType(in.readByte());
        int length = in.readInt();

        byte[] bodyBytes = new byte[length];

        in.readBytes(bodyBytes);
        //Message msg = JSON.parseObject(bodyBytes,Message.class);
        //Message msg = (Message) KryoUtil.deserialize(bodyBytes);
        Message msg = new KryoSerializer().deserialize(bodyBytes, Message.class);
        out.add(msg);
    }

}
