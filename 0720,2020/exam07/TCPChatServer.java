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
			System.out.println("서버가 가동되었습니다.");
		
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				(new ServerThread(socket)).start();
			}
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}