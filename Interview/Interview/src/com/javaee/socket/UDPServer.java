package com.javaee.socket;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP ���ݰ����շ�
 * ����A(���շ�):
 *    (1)����DatagramSocket���͵Ķ��󣬲������ָ���Ķ˿ڰ󶨡�
 *    (2)����DatagramPacket���͵Ķ��󣬵ȴ��������ݡ�
 *    (3)����receive()�������������ݡ�
 *    (4)�ر�Socket���ͷ��йص���Դ��
 * @Auther: XDragon
 * @Date: 2021/2/20/020 22:36
 * @Email:cnxielong@gmail.com
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        //
        DatagramSocket datagramSocket = new DatagramSocket(1235);//(1)����DatagramSocket���͵Ķ��󣬲������1234ָ���Ķ˿ڰ󶨡�
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);//����DatagramPacket���͵Ķ��󣬵ȴ��������ݡ�
        System.out.println("UDPServer�ȴ���������");
        datagramSocket.receive(datagramPacket);//(3)����receive()�������������ݡ�
        System.out.println("UDPServer ���յ���������:" + new String(bytes, 0, bytes.length));
        datagramSocket.close();//�ر���Դ
    }
}
