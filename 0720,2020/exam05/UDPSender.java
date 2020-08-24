package com.bit.exam05;
//�ڹ� UDPSender  192.163.137.1 9002 �ȳ�

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress addr = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			byte[] data = args[2].getBytes();
			DatagramPacket packet = new DatagramPacket(data,data.length, addr,port);
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			System.out.println("���ܹ߻� " +e.getMessage());
		}
	}

}
