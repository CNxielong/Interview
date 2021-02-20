package com.javaee.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TPC服务器端
 *             (1)创建ServerSocket类型的对象，并绑定参数指定的端口号。
 *             (2)等待客户端的连接请求，调用accept()方法。
 *             (3)得到Socket类型的对象并使用输入输出流进行通信。
 *             (4)关闭Socket并释放有关的资源。
 * @Auther: XDragon
 * @Date: 2021/2/20/020 21:29
 * @Email:cnxielong@gmail.com
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket tcpServer =  new ServerSocket(1234);
        Socket accept = tcpServer.accept();
        InputStream inputStream = accept.getInputStream();//获取输入流
//        inputStream.

    }
}
