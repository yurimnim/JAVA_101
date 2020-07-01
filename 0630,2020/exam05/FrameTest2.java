package com.bit.exam05;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++) {
			JFrame f = new JFrame("창만들기" + i);
			
			f.setSize(300,200);
			f.setLocation(i*30, 20);
			f.setVisible(true);
		}

	}
}
