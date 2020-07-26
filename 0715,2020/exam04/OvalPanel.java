package com.bit.exam04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

class GraphicInfo {
	private int x;
	private int y;
	
	public GraphicInfo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}		
}

public class OvalPanel extends JPanel {
	int x=-10, y=-10;
	ArrayList<GraphicInfo> list;
	
	public OvalPanel() {
		list = new ArrayList<GraphicInfo>();
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				list.add(new GraphicInfo(x, y));
				repaint();
				//다시그려주세요 라고 요청한다
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
		//super.paintComponent(g);
		g.setColor(Color.red);
		//g.drawOval(x, y, 10, 10);
		
		for(GraphicInfo info:list) {
			g.drawOval(info.getX(), info.getY(), 10, 10);
		}
		
	}
	
	
}



