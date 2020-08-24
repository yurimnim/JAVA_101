package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPChatClient extends JFrame {
	JTextArea jta01;
	JTextField jtf01;
	InputStream is;
	OutputStream os;
	
	public TCPChatClient(String ip) {
		jta01 = new JTextArea();
		jtf01 = new JTextField(50);
		JScrollPane jsp = new JScrollPane(jta01);
		JButton btn = new JButton("전송");
		JPanel p = new JPanel();
		p.add(jtf01);
		p.add(btn);
		
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setSize(800, 600);
		setVisible(true);
		
		try {			
				Socket socket = new Socket(ip, 9022);
				jta01.append("접속완료\n");
				is = socket.getInputStream();
				os = socket.getOutputStream();							
		} catch (Exception e) {
			System.out.println("ChatClient 예외발생: " + e.getMessage());
		}
		
		jtf01.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {				
				send();				
			}
		});
		
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				send();				
			}
		});
		
		class ClientThread extends Thread{
			public void run() {
				byte []data = new byte[100];
				while(true) {
					try {
						is.read(data);
						String msg = new String(data);
						jta01.append(msg + "\n");
						Arrays.fill(data, (byte)0);
					} catch (Exception e) {
						System.out.println("ClientThread 예외발생:" + e.getMessage());
					}
				}
			}
		}
		
		ClientThread thread = new ClientThread();
		thread.start();
	}
	
	protected void send() {						
			String msg = jtf01.getText();
			byte[] data = msg.getBytes();
			try {
				os.write(data);
				jtf01.setText("");
			} catch (Exception e) {
				System.out.println("Send mtd예외발생: " + e.getMessage());
			}
	}

	public static void main(String[] args) {
		new TCPChatClient(args[0]);
	}
}
