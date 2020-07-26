package com.bit.exam02;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinePanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.drawLine(10, 90, 110, 10);
		//g.drawRect(10, 10, 100, 100);
//		g.setColor(Color.red);
//		g.drawOval(10, 10, 100, 100);
//		g.setColor(Color.blue);
//		g.drawRect(10, 150, 100, 100);
	}
	
}
