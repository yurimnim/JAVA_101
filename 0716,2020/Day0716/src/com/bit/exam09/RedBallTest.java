package com.bit.exam09;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class RedBall extends JPanel implements Runnable {
	int x = 10;
	int y = 200;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x, y, 20, 20);	
	}
	
	public void run() {	
		
		while(true) {
			while(true) {
				try {				
					Thread.sleep(200);				
				} catch (InterruptedException e) {
		
				}
				x += 10;
				y -= 4;
				repaint();
				
				if(x==360) {
					break;
				}	
				
			}
			while(true) {
				try {				
					Thread.sleep(200);				
				} catch (InterruptedException e) {
		
				}
				x -=10;
				y += 4;
				repaint();
					if(x == 10) {
						break;
				}	
				
			}
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

