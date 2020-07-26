package com.bit.exam06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

class GraphicInfo {
	private int x;
	private int y;
	private Color drawColor;
	private int drawType;
	
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
	public Color getDrawColor() {
		return drawColor;
	}

	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}
	public int getDrawType() {
		return drawType;
	}
	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}


	public GraphicInfo(int x, int y, Color drawColor, int drawType) {
		super();
		this.x = x;
		this.y = y;
		this.drawColor = drawColor;
		this.drawType = drawType;
	}
}

	public class AllPanel extends JPanel {	
	int x = -10;
	int y = -10;
	Color drawColor;
	int drawType; //0:대각선 1:사각형 2:원
	ArrayList<GraphicInfo> list;
	
	public AllPanel() {
		list = new ArrayList<GraphicInfo>();
		drawColor = Color.red;
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				list.add(new GraphicInfo(x,y,drawColor,drawType));
				repaint();
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
		super.paintComponent(g);
		//10,10 좌표에 길이 10인 대각선 그리기
//		g.setColor(drawColor);
//		g.drawLine(x-5, y-5, x+5, y+5);
//		g.drawLine(x+5, y-5, x-5, y+5);
		
		for(GraphicInfo info:list) {
			g.setColor(info.getDrawColor());
			
			switch(info.getDrawType()) {
				case 0:
					g.drawLine(info.getX()-5, info.getY()-5, info.getX()+5, info.getY()+5);
					g.drawLine(info.getX()+5, info.getY()-5, info.getX()-5, info.getY()+5);
					break;
				case 1:
					g.drawRect(info.getX(), info.getY(), 10, 10);
				case 2:
					g.drawOval(info.getX(), info.getY(), 10, 10);
					break;
			}			
			
		}
			
	}
 }


