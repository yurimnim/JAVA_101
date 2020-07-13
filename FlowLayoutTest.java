package com.bit.exam03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//버튼 15개를 Flow Layout을 방식으로 담아봅시다. 
class MyFrame extends JFrame {
	public MyFrame(){
		setLayout(new FlowLayout());
		for(int i=1; i <= 15; i++) {
			add(new JButton("버튼" + i));
		}
		setSize(400, 300);
		setVisible(true);
	}
}

public class FlowLayoutTest {
	public static void main(String[] args) {
		new MyFrame();

	}

}
