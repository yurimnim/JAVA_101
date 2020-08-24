package com.bit.exam04;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient {
		
	public static void main(String[] args) {
		try {
			String ip = args[0];
			Socket socket = new Socket(ip, 9001);
			System.out.println("서버와 연결되었습니다.");
			InputStream is = socket.getInputStream();
			for(int i=1; i<=10; i++){
				int n = is.read();
				System.out.println("서버로부터 수신된 데이터:" + n);
			}
			is.close();
			socket.close();
			System.out.println("통신을 종료합니다.");
		} catch (Exception e) {
			System.out.println("예외발생 " + e.getMessage());
		}		
	}
}
