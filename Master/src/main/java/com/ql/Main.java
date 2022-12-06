package com.ql;


import com.ql.decode.MyDecoder;
import com.ql.handler.MyServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        run(/*"169.254.190.154",*/1234);

    }

    private static void run(/*String ip,*/int port) throws InterruptedException {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(/*ip,*/port)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            log.info("---------有客户端连接--------------");
                            log.info("IP:" + ch.localAddress().getHostName());
                            log.info("Port:" + ch.localAddress().getPort());
                            //日志
                            ch.pipeline().addLast(new LoggingHandler(LogLevel.INFO));
//                            ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(ByteOrder.LITTLE_ENDIAN,
//                                    1024 * 1024, 2, 2,
//                                    -4, 0, true));
                            //解码
                            ch.pipeline().addLast(new MyDecoder());
                            // 自定义处理类
                            ch.pipeline().addLast(new MyServerHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 1024);
//                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            // 绑定端口，开始接收进来的连接
            ChannelFuture cf = b.bind(port).sync();
            log.info("socket服务端启动成功 {}", cf.channel().localAddress().toString());
            // 等待服务器socket关闭
            cf.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
