package com.bit.exam03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//��ư 15���� Flow Layout�� ������� ��ƺ��ô�. 
class MyFrame extends JFrame {
	public MyFrame(){
		setLayout(new FlowLayout());
		for(int i=1; i <= 15; i++) {
			add(new JButton("��ư" + i));
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
