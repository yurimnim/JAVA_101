package com.bit.exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPChatClient extends JFrame {
	JTextArea jta01;
	JTextField jtf01;
	InputStream is;
	OutputStream os;
	String nickname;
	Socket socket;
	
	//���嶧 ��ȭ�� �ޱ�
	public TCPChatClient(String ip, String nickname) {
		jta01 = new JTextArea();
		jtf01 = new JTextField(50);
		JScrollPane jsp = new JScrollPane(jta01);
		JButton btn = new JButton("����");
		JButton btn2 = new JButton("��ȭ���� ����");
		JPanel p = new JPanel();
		p.add(jtf01);
		p.add(btn);
		p.add(btn2);
		
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setSize(800, 600);
		setVisible(true);
				
		try {			
				socket = new Socket(ip, 9022);
				jta01.append("���ӿϷ�\n");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				//���弱��
				String intro = "### "+nickname + "  �Բ��� ä�ù濡 �����ϼ̽��ϴ�.\n";
				byte[] introb = intro.getBytes();
				try {
					os.write(introb);
				} catch (Exception e){
					System.out.println("ChatClient ���ܹ߻�: " + e.getMessage());
				}
				
		} catch (Exception e) {
			System.out.println("ChatClient ���ܹ߻�: " + e.getMessage());
		}
		
		//�׼�
		jtf01.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				send(nickname);				
			}
		});
		
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				send(nickname);				
			}
		});
		
		//������â �ݾ��� �� ä�ù� ����, �������� �����ϱ�
				addWindowListener(new WindowListener() {			
					@Override
					public void windowOpened(WindowEvent e) {}
					@Override
					public void windowIconified(WindowEvent e) {}
					@Override
					public void windowDeiconified(WindowEvent e) {}			
					@Override
					public void windowDeactivated(WindowEvent e) {}			
					@Override
					public void windowClosing(WindowEvent e) {
						String outro = nickname + ": �Բ��� ä�ù��� �������ϴ�.";
						byte[] outrobytes = outro.getBytes();
						try {
							os.write(outrobytes);
							String outroExit = nickname + "^exit";
							byte[] data = outroExit.getBytes();
							os.write(data);
							is.close();
							os.close();
							socket.close();							
						} catch (Exception eo) {
							System.out.println("Windowclose ���ܹ߻�: " + eo.getMessage());
						}		
					}	
					@Override
					public void windowClosed(WindowEvent e) {}		
					@Override
					public void windowActivated(WindowEvent e) {}
				});
				//��
			
		//������� ��ȭ���� ����
		btn2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				int re = jfc.showSaveDialog(null);
				if(re==0) {
					try {
						FileWriter fw = new FileWriter(jfc.getSelectedFile());
						fw.write(jta01.getText());
						fw.close();
						JOptionPane.showMessageDialog(null, "����Ϸ�");
					} catch (IOException e1) {
						System.out.println("�����ư ���ܹ߻� " + e1.getMessage());
					}
				}				
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
						//�������� �����Ǹ� â �ݱ� 
						System.exit(1);
					}
				}
			}
		}
		
		ClientThread thread = new ClientThread();
		thread.start();
	}
	
	protected void send(String nickname) {						
			String msg = nickname + ": " + jtf01.getText();
			byte[] data = msg.getBytes();			
			try {
				os.write(data);
				jtf01.setText("");
			} catch (Exception e) {
				System.out.println("Send mtd ���ܹ߻�: " + e.getMessage());
			}
	}

	public static void main(String[] args) {
		new TCPChatClient(args[0], args[1]);
	}
}
