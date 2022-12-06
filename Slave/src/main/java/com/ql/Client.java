package com.ql;

import com.ql.encode.MyEncode;
import com.ql.handler.ClientHandler;
import com.ql.protocol.Header;
import com.ql.protocol.Message;
import com.ql.protocol.enums.MessageTypeEnum;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.Scanner;


@Slf4j
public class Client {
    public static void main(String[] args) throws InterruptedException {
        run("169.254.190.154", 1234);
    }

    public static void run(String host, int port) throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bs = new Bootstrap();
            bs.group(group)
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host, port))
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new LoggingHandler(LogLevel.INFO));
                            ch.pipeline().addLast(new MyEncode());
                            ch.pipeline().addLast(new ClientHandler());
                        }
                    });

            ChannelFuture cf = bs.connect().sync();
            log.info("启动成功{}", cf.channel().localAddress().toString());

            Scanner scanner = new Scanner(System.in);
            do {
                String next = scanner.next();
                Header header = new Header();
                header.setCrcCode(0X80);
                header.setType(MessageTypeEnum.MSG.getValue());
                header.setSessionId(2222222);
                Message msg = new Message();
                msg.setBody(next);
                msg.setHeader(header);
                cf.channel().writeAndFlush(msg);
            } while (scanner.hasNext());
            cf.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }

    }
}
