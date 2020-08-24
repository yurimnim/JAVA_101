package com.bit.exam03;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextField jtf01;
	JTextArea jta01;
	
	public MyFrame() {
		jtf01 = new JTextField(50);
		jta01 = new JTextArea();
		JScrollPane jsp =new JScrollPane(jta01);
		JPanel p = new JPanel();
		JButton btn_read = new JButton("읽기");
		JButton btn_save = new JButton("저장");
		
		p.add(jtf01);
		p.add(btn_read);
		p.add(btn_save);
		
		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		
		btn_read.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					URL url = new URL(jtf01.getText());
					InputStream is = url.openStream();
					byte []data = is.readAllBytes();
					String str = new String(data, "utf-8");
					jta01.setText(str);
					is.close();
				} catch (Exception e2) {
					System.out.println("예외발생"+e2.getMessage());
				}
				
			}
		});
		
		btn_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser("c:/MyData");
				int re = jfc.showSaveDialog(null);
				if(re==0) {
					try {
						FileWriter fw = new FileWriter(jfc.getSelectedFile());
						fw.write(jta01.getText());
						fw.close();
						JOptionPane.showMessageDialog(null, "저장완료");
					} catch (IOException e1) {
						System.out.println("예외발생 " + e1.getMessage());
					}
				} else {
					
				}
		
			}
		});
		
		setSize(800,600);
		setVisible(true);
	}
}
	

public class URLTest03 {

	public static void main(String[] args) {
		new MyFrame();
		
	}

}
