package com.bit.exam05;
//��ư 5���� �����Ͽ� borderlayout���� �����ϰ� �������� ��� ��ġ�غ���.

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new BorderLayout());
	//	add(new JButton("����"), BorderLayout.NORTH);
	//	add(new JButton("�Ʒ���"),BorderLayout.SOUTH);
		add(new JButton("������"),BorderLayout.EAST);
		add(new JButton("����"),BorderLayout.WEST);
		add(new JButton("���"),BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
}

public class BorderLayoutTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
