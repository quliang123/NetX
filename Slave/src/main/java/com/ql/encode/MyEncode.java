package com.ql.encode;

import com.ql.protocol.Header;
import com.ql.protocol.Message;
import com.ql.utils.KryoSerializer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-29 10:26
 **/
@Slf4j
public class MyEncode extends MessageToByteEncoder<Message> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Message msg, ByteBuf out) throws Exception {
        Header header = msg.getHeader();

        //byte[] bytes = JSON.toJSONBytes(msg);
        byte[] bytes = new KryoSerializer().serialize(msg);


        out.writeInt(header.getCrcCode());
        out.writeLong(header.getSessionId());
        out.writeByte(header.getType());
        out.writeInt(bytes.length);
        out.writeBytes(bytes);
    }
}
