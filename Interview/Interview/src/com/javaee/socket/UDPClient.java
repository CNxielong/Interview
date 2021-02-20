package com.javaee.socket;

import java.io.IOException;
import java.net.*;

/**
 * UDP�ͻ��˷��ͷ�
 * ����B(���ͷ�):
 *    (1)����DatagramSocket���͵Ķ���
 *    (2)����DatagramPacket���͵Ķ��󣬲��ṩ���շ���IP��ַ�Ͷ˿ںš�
 *    (3)����send()�������������ݡ�
 *    (4)�ر�Socket���ͷ��йص���Դ��
 * @Auther: XDragon
 * @Date: 2021/2/20/020 22:51
 * @Email:cnxielong@gmail.com
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();//(1)����DatagramSocket���͵Ķ���
        byte[] bytes = new byte[1024];
        String s = new String("hello world!");
        bytes = s.getBytes();
        System.out.println("UDPClient ���͵�������:"+s);
//        InetAddress inetAddress = new InetAddress();//"192.168.31.248"
//        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("192.168.31.248"),8083);//(2)����DatagramPacket���͵Ķ��󣬲��ṩ���շ���IP��ַ�Ͷ˿ںš�
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,InetAddress.getLocalHost(),1235);//(2)����DatagramPacket���͵Ķ��󣬲��ṩ���շ���IP��ַ�Ͷ˿ںš�
        datagramSocket.send(datagramPacket);//(3)����send()�������������ݡ�
        datagramSocket.close();

    }
}
