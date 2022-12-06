package com.ql.handler;

import com.ql.protocol.Message;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.ImmediateEventExecutor;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: quliang
 * @create: 2022-09-25 01:35
 **/
@Slf4j
@ChannelHandler.Sharable
public class MyServerHandler extends ChannelInboundHandlerAdapter {

    private static final ChannelGroup CHANNELGROUP = new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        CHANNELGROUP.add(ctx.channel());
        log.info("服务端：{} 通道开启！", ctx.channel().localAddress().toString());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        CHANNELGROUP.remove(ctx.channel());
        log.info("服务端: {} 通道关闭！", ctx.channel().localAddress().toString());
    }

    @Override
    public void channelRead(final ChannelHandlerContext ctx, final Object msg) throws Exception {
        Message data = (Message) msg;
        log.info("服务端: {} 读取数据 {}", ctx.channel().localAddress().toString(), data.toString());

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        log.info("...............数据接收-完毕...............");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        log.error("...............业务处理异常...............{}", cause);
    }
}
