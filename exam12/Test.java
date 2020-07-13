package com.bit.exam12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame extends JFrame {
	JTextArea jta01;
	JTextArea jta02;
	
	public MyFrame() {
		jta01 = new JTextArea(10,60);
		jta02 = new JTextArea(10,60);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		setLayout(new BorderLayout());
//		p1.setBackground(Color.GREEN);
//		p2.setBackground(Color.BLUE);				
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		p1.setLayout(new GridLayout(1, 2, 15, 3));
		p1.add(jta01);
		p1.add(jta02);
		
		JButton btn01 = new JButton("번역");
		JButton btn02 = new JButton("취소");
		
		p2.setLayout(new FlowLayout());
		p2.add(btn01);
		p2.add(btn02);
		
		setSize(800,400);
		setVisible(true);
	}
}

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
