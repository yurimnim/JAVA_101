package com.bit.exam07;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ServerThread extends Thread {
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	
	public ServerThread(Socket socket) {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();			
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
	}
	
	public void run() {
		byte []data = new byte[100];
		while(true) {
			try {
				is.read(data);
				os.write(data);
				String msg = new String(data);
				System.out.println(msg);
				Arrays.fill(data,(byte)0);
			} catch (Exception e) {
				System.out.println("예외발생:" + e.getMessage());
			}			
		}
	}
}
