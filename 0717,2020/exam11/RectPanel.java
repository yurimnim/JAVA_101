package com.bit.exam11;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RectPanel extends JPanel implements Runnable {
	int x = 10;
	int y = 10;
	int width = 30;
	int height= 4; 
	int max_height= 280; 
	int max_width = 380;
	int min_height= 10; 
	int min_width = 20;
	int step = 10;
	
	public RectPanel() {

	}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void run() {
		
		while(true) {
			width = width + step;
			height= height + step;
			
			if(width > 
		}
	}
	
}
