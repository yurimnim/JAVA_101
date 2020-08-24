package com.bit.exam06;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatServer {
	public static void main(String[] args) {
		try {
			byte []data = new byte[100];
			ServerSocket server = new ServerSocket(9015);
			System.out.println("서버가 가동되었습니다.");
			while(true) {
				Socket sockets = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				InputStream is = sockets.getInputStream();
				OutputStream os = sockets.getOutputStream();
				while(true) {
					is.read(data);
					os.write(data);
					String msg = new String(data);
					System.out.println(msg);
					Arrays.fill(data,(byte)0);
				}
			}
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}