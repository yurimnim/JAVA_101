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
			System.out.println("서버가 가동되었습니다.");
			while(true) { //접속을 끝없이 기다리기
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				ServerThread thread = new ServerThread(socket);
				list.add(thread);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println("Server main 예외발생: " + e.getMessage());
		}
	}
}
