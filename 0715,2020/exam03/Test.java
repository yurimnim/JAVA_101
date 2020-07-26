package com.bit.exam03;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	OvalPanel op;
	
	public MyFrame() {
		op = new OvalPanel();
		add(op);
		setSize(400, 300);
		setVisible(true);
	}
}


public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}

}
