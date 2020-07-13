package com.bit.exam08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀다.");
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new FlowLayout());
		JButton btn = new JButton("확인");
		btn.addActionListener(new MyEvent());
		add(btn);
		setSize(400, 300);
		setVisible(true);
	}
}

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
