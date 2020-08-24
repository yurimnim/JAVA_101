package com.bit.exam02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServerThread extends Thread {
	Socket socket;
	InputStream is;
	OutputStream os;
//	byte[] data;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			System.out.println("ServerThread constructor ���ܹ߻�: " + e.getMessage());
		}				
	}
	
	public void sendAll(byte[] data) {
		for(ServerThread st:TCPChatServer.list) {			
				st.send(data);
		}
	}
	
	public void send(byte[] data) {
		try {			
			os.write(data);			
		} catch (Exception e) {
			System.out.println("ServerThread Send ���ܹ߻�: " + e.getMessage());
		}		
	}
	
	public void run() {
		byte []data = new byte[100];
		while(true) { //��û�� Ŭ���̾�Ʈ�� ��ȭ�� �ϱ����� �ݺ���
			try {
				is.read(data);
				//os.write(data);
				sendAll(data);		
				Arrays.fill(data, (byte)0); //�̹� ������ ����ֱ�.
			} catch (Exception e) {
				System.out.println("ThreadRun ���ܹ߻�: " + e.getMessage());
			}				
		}
	}
}
