package com.bit.exam04;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient {
		
	public static void main(String[] args) {
		try {
			String ip = args[0];
			Socket socket = new Socket(ip, 9001);
			System.out.println("������ ����Ǿ����ϴ�.");
			InputStream is = socket.getInputStream();
			for(int i=1; i<=10; i++){
				int n = is.read();
				System.out.println("�����κ��� ���ŵ� ������:" + n);
			}
			is.close();
			socket.close();
			System.out.println("����� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("���ܹ߻� " + e.getMessage());
		}		
	}
}
