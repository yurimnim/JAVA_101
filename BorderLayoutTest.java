package com.bit.exam05;
//버튼 5개를 설정하여 borderlayout으로 설정하고 동서남북 가운데 배치해보자.

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new BorderLayout());
	//	add(new JButton("위쪽"), BorderLayout.NORTH);
	//	add(new JButton("아래쪽"),BorderLayout.SOUTH);
		add(new JButton("오른쪽"),BorderLayout.EAST);
		add(new JButton("왼쪽"),BorderLayout.WEST);
		add(new JButton("가운데"),BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
}

public class BorderLayoutTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
