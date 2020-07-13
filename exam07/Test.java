package com.bit.exam07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
		JTextField jtf01;
		JTextField jtf02;
		JTextField jtf03;
	
		public MyFrame() {
			JButton btn = new JButton("+");
			btn.addActionListener(this);
			
			jtf01 = new JTextField(5);
			jtf02 = new JTextField(5);
			jtf03 = new JTextField(5);
			
			setLayout(new FlowLayout());
			
			add(new JLabel("¼ö1"));
			add(jtf01);
			add(new JLabel("¼ö2"));
			add(jtf02);
			add(btn);
			add(jtf03);
			
			setSize(600,300);
			setVisible(true);
		}
	
		public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(jtf01.getText());
			int b = Integer.parseInt(jtf02.getText());
			int r = a + b;
			jtf03.setText(r+"");		
		}
	}


public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
