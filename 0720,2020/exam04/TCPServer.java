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
			System.out.println("서버가 가동되었습니다.");
			System.out.println("클라이언트의 접속을 기다리는 중...");
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				OutputStream os = socket.getOutputStream();
				for(int i=1; i<=10; i++) {
					int n = r.nextInt(100)+1;
					os.write(n);
					Thread.sleep(200);
				}
				os.close();
				socket.close();
				System.out.println("클라이언트와 통신을 종료합니다.");
			}
		} catch (Exception e) {
			System.out.println("예외발생 " +  e.getMessage());
		}		
	}
}
