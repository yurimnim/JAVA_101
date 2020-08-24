package com.bit.exam01;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TCPChatServer {
	
	public static ArrayList<ServerThread> list;
	
	public static void main(String[] args) {
		list = new ArrayList<ServerThread>();
		try {
			ServerSocket server = new ServerSocket(9022);
			System.out.println("������ �����Ǿ����ϴ�.");
			while(true) { //������ ������ ��ٸ���
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				ServerThread thread = new ServerThread(socket);
				list.add(thread);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println("Server main ���ܹ߻�: " + e.getMessage());
		}
	}
}
