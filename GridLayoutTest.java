package com.bit.exam04;
//15���� ��ư�� 3�� 5���� GridLayout �� ��ġ�ϴ� ���α׷��� ������  

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new GridLayout(3, 5));
		for(int i = 1; i<=12;i++) {
			add(new JButton("��ư " + i));
		}
		setSize(400, 300);
		setVisible(true);
	}
}

public class GridLayoutTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
