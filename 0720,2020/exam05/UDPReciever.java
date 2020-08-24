package com.bit.exam05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPReciever {
	public static void main(String[] args) {		
		try {
			DatagramSocket socket = new DatagramSocket(9002);
			byte []data = new byte[100];
			
			while(true) {	
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				String msg = new String(data);
				System.out.println("���ŵ� ������: " + msg);
				Arrays.fill(data, (byte)0);
			}				
//			socket.close();
		} catch (Exception e) {
			System.out.println("���ܹ߻�:" + e.getMessage());
		}
	}
}
