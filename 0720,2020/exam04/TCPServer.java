package com.bit.exam04;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
	public static void main(String[] args) {
		Random r = new Random();
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("������ �����Ǿ����ϴ�.");
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��...");
			while(true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				OutputStream os = socket.getOutputStream();
				for(int i=1; i<=10; i++) {
					int n = r.nextInt(100)+1;
					os.write(n);
					Thread.sleep(200);
				}
				os.close();
				socket.close();
				System.out.println("Ŭ���̾�Ʈ�� ����� �����մϴ�.");
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻� " +  e.getMessage());
		}		
	}
}
