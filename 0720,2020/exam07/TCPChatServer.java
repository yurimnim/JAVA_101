package com.bit.exam07;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9015);
			System.out.println("������ �����Ǿ����ϴ�.");
		
			while(true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				(new ServerThread(socket)).start();
			}
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}