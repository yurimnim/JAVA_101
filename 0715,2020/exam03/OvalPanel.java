package com.bit.exam03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
	int x=-10, y=-10;
	
	public OvalPanel() {
		System.out.println("�����ڵ���");
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
				//�ٽñ׷��ּ��� ��� ��û�Ѵ�
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponent(g);
		g.setColor(Color.red);
		g.drawOval(x, y, 10, 10);
	}
	
	
}



