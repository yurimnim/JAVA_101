package com.bit.exam10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("확인"))
			System.out.println(cmd +"을 눌렀다.");
		else 
			System.out.println(cmd + "를 눌렀다.");
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new FlowLayout());
		JButton btn = new JButton("확인");
		btn.addActionListener(new MyEvent());	
		JButton btn2 = new JButton("취소");
		btn2.addActionListener(new MyEvent());
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
