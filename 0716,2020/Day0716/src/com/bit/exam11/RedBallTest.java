package com.bit.exam11;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



class RedBall extends JPanel implements Runnable {
	int x = 10;
	int y = 200;
	int xstep = 10;
	int ystep = -10;
	int width = 400;
	int height = 300;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x, y, 20, 20);	
	}
	
	public void run() {	
			while(true) {
				height = getHeight();
				width = getWidth();
				try {				
					Thread.sleep(100);				
				} catch (InterruptedException e) {
		
				}
								
				if(y<10 || (y+30) > height) {
					ystep = ystep*-1;
				}
				if((x+30) > width ||x<10) {
					xstep = -xstep;
				}
				
				x += xstep;
				y += ystep;
				repaint();				
			}
				
	}
}

class MyFrame extends JFrame {
	RedBall ball;

	public MyFrame() {
		ball = new RedBall();
		add(ball);
		setSize(400, 300);
		setVisible(true);	
		(new Thread(ball)).start();
	}
}

public class RedBallTest {
	public static void main(String[] args) {
		MyFrame b = new MyFrame();
	}

 }

