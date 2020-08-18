package com.bit.exam07;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class RedBall extends JPanel implements Runnable {
	int x = 10;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x, 200, 20, 20);	
	}
	
	public void run() {	
		while(true) {
			try {				
				Thread.sleep(200);				
			} catch (InterruptedException e) {
	
			}
			x += 10;
			repaint();
			if(x == 360)
				break;
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

