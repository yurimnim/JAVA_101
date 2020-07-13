package com.bit.exam04;
//15개의 버튼을 3행 5열의 GridLayout 을 배치하는 프로그램을 만들자  

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new GridLayout(3, 5));
		for(int i = 1; i<=12;i++) {
			add(new JButton("버튼 " + i));
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
