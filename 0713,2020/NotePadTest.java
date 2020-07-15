package com.bit.exam10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextArea jta;
	JTextField jtf01;
	
	public MyFrame() {
		jta = new JTextArea(20, 80);
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		
		setLayout(new BorderLayout());
		jtf01 = new JTextField(15);
		JPanel p2= new JPanel();
		add(p2,BorderLayout.CENTER);
		
		JLabel filename = new JLabel("파일명:");
		p2.add(filename);
		p2.add(jtf01);
		p2.add(jsp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		jmb.add(mn_file);
		setJMenuBar(jmb);
		
		add(p2);
		
		setSize(900, 500);
		setVisible(true);
		
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String fname = jtf01.getText();
					FileReader fr = new FileReader(fname);
					int ch;
					String str = "";
					while((ch = fr.read()) != -1){
						str = str + (char)ch;
					}
					fr.close();
					jta.setText(str);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		file_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jta.getText();
				try {
					String fname = jtf01.getText();
					FileWriter fw = new FileWriter(fname);
					fw.write(str);
					fw.close();
					System.out.println("파일을 기록하였습니다.");
				}catch(IOException ex) {
					System.out.println("예외발생" + ex.getMessage());
				}
			}
		});
	}
}

public class NotePadTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
