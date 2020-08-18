package com.bit.exam12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//이미지 두개 번갈아가면서 나오도록 코드 수정

class ManPanel extends JPanel implements Runnable {
	BufferedImage man01;
	BufferedImage man02;
	int x = 10;
	int n;
	
	public ManPanel() {
		setBackground(Color.WHITE);
		try {
			man01 = ImageIO.read(new File("PACMAN1.png"));
			man02 = ImageIO.read(new File("PACMAN2.png"));
		}catch(Exception e) {
			System.out.println("예외" + e.getMessage());
		}
		
		(new Thread(this)).start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(n % 2 ==0) {
			g.drawImage(man01, x, 200, null);
		}else {
			g.drawImage(man02, x, 200, null);
		}
	}

	@Override
	public void run() {		
		while(true) {
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
				x  = x+10; 
				n++;
				repaint();				
		}
		
	}	
}

class MyFrame extends JFrame {
	ManPanel mp;
	
	public MyFrame() {
		mp = new ManPanel();
		add(mp);
		setSize(400,300);
		setVisible(true);
	}
}

public class PacManTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		
	}

}
