package com.javaee.socket;

import java.io.IOException;
import java.net.*;

/**
 * UDP客户端发送方
 * 主机B(发送方):
 *    (1)创建DatagramSocket类型的对象。
 *    (2)创建DatagramPacket类型的对象，并提供接收方的IP地址和端口号。
 *    (3)调用send()方法来发送数据。
 *    (4)关闭Socket并释放有关的资源。
 * @Auther: XDragon
 * @Date: 2021/2/20/020 22:51
 * @Email:cnxielong@gmail.com
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();//(1)创建DatagramSocket类型的对象。
        byte[] bytes = new byte[1024];
        String s = new String("hello world!");
        bytes = s.getBytes();
        System.out.println("UDPClient 发送的数据是:"+s);
//        InetAddress inetAddress = new InetAddress();//"192.168.31.248"
//        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("192.168.31.248"),8083);//(2)创建DatagramPacket类型的对象，并提供接收方的IP地址和端口号。
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getLocalHost(),1235);//(2)创建DatagramPacket类型的对象，并提供接收方的IP地址和端口号。
        datagramSocket.send(datagramPacket);//(3)调用send()方法来发送数据。
        datagramSocket.close();

    }
}
