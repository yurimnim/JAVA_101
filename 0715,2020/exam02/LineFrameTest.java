package com.bit.exam02;

import javax.swing.JFrame;

class LineFrame extends JFrame {
	LinePanel lp;
	
	public LineFrame() {
		lp = new LinePanel();
		add(lp);
		setSize(400,300);
		setVisible(true);
	}
}


public class LineFrameTest {
	public static void main(String[] args) {
		new LineFrame();
	}

}
