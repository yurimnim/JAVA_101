package com.bit.exam11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/*
class MyEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ȯ���� ������.");
	}
}
class MyEvent2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("��Ҹ� ������.");
	}
}
*/
class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Ȯ��");	
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ȯ��");		
			}
		});			
		
		JButton btn2 = new JButton("���");	
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���");
			}
		});
		
		add(btn);
		add(btn2);
		setSize(400, 300);
		setVisible(true);
	}
}
public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
