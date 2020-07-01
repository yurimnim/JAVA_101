package com.bit.exam05;

import javax.swing.JFrame;

public class FrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("moving frame");
		f.setSize(300,200);
		f.setLocation(10, 10);
		f.setVisible(true);
		
		int x = 10;
		for(int i = 1; i <= 10; i++) {
			f.setLocation(x,10);
			x = x + 100;
			try {
			Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}

	}

}
