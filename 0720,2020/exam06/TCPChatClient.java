package com.bit.exam06;

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
	JTextField jtf01;
	JTextArea jta01;
	OutputStream os;
	InputStream is;
	
	public TCPChatClient(String ip) {
		jta01 = new JTextArea();
		jtf01 = new JTextField(50);
		JScrollPane jsp = new JScrollPane(jta01);
		JButton btn_send= new JButton("전송");
		JPanel p = new JPanel();
		p.add(jtf01);
		p.add(btn_send);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		setSize(800, 600);
		setVisible(true);
				
		try {
			Socket socket = new Socket(ip, 9015);
			jta01.append("접속하였습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생:"+e.getMessage());
		}
		
		jtf01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		btn_send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				byte []data = new byte[100];
				while(true) {
					try {
						is.read(data);
						String msg = new String(data);
						jta01.append(msg+"\n");
						Arrays.fill(data, (byte)0);
					}catch (Exception e) {
						e.getMessage();
					}
				}
			}
		}).start();		
	}

	protected void sendMsg() {
		try {
			String msg = jtf01.getText();
			os.write(msg.getBytes());
			jtf01.setText("");
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			
		}
	}

	public static void main(String[] args) {
		new TCPChatClient(args[0]);
	}

}
