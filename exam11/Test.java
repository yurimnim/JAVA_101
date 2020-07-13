package com.bit.exam11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/*
class MyEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("확인을 눌렀다.");
	}
}
class MyEvent2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("취소를 눌렀다.");
	}
}
*/
class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("확인");	
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인");		
			}
		});			
		
		JButton btn2 = new JButton("취소");	
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소");
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
