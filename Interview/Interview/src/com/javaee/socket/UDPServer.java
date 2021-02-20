package com.javaee.socket;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP 数据包接收方
 * 主机A(接收方):
 *    (1)创建DatagramSocket类型的对象，并与参数指定的端口绑定。
 *    (2)创建DatagramPacket类型的对象，等待接收数据。
 *    (3)调用receive()方法来接收数据。
 *    (4)关闭Socket并释放有关的资源。
 * @Auther: XDragon
 * @Date: 2021/2/20/020 22:36
 * @Email:cnxielong@gmail.com
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        //
        DatagramSocket datagramSocket = new DatagramSocket(1235);//(1)创建DatagramSocket类型的对象，并与参数1234指定的端口绑定。
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);//创建DatagramPacket类型的对象，等待接收数据。
        System.out.println("UDPServer等待接受数据");
        datagramSocket.receive(datagramPacket);//(3)调用receive()方法来接收数据。
        System.out.println("UDPServer 接收到的数据是:" + new String(bytes, 0, bytes.length));
        datagramSocket.close();//关闭资源
    }
}
