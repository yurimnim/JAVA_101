package com.bit.exam01;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JPanel;

class GraphicInfo implements Serializable{
	Point p1;
	private int sx;
	private int sy;
	private int ex;
	private int ey;
	private int drawType;
	private Color drawColor;

	public GraphicInfo(int sx, int sy, int ex, int ey, int drawType, Color drawColor) {
		super();
		this.sx = sx;
		this.sy = sy;
		this.ex = ex;
		this.ey = ey;
		this.drawType = drawType;
		this.drawColor = drawColor;
	}

	public void setP1(Point p1) {this.p1 = p1;}
	public int getSx() {
		return sx;
	}
	public void setSx(int sx) {
		this.sx = sx;
	}
	public int getSy() {
		return sy;
	}
	public void setSy(int sy) {
		this.sy = sy;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getEy() {
		return ey;
	}
	public void setEy(int ey) {
		this.ey = ey;
	}
	public int getDrawType() {
		return drawType;
	}
	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}
	public Color getDrawColor() {
		return drawColor;
	}
	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}
	
}

public class LinePanel extends JPanel {

	Color drawColor=Color.black;
	GraphicInfo gi;
	ArrayList<GraphicInfo> list;

	int isNew = 0;
	int sx, sy, ex, ey;
	int drawType=0; //0:선, 1:사각형, 2:원

	public LinePanel() {
		list = new ArrayList<GraphicInfo>();

		addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				isNew = 1;
				ex = e.getX();
				ey = e.getY();
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {

			}
		});

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				isNew = 1;
				ex = e.getX();
				ey = e.getY();
				list.add(new GraphicInfo(sx, sy, ex, ey, drawType, drawColor));
				repaint();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				isNew = 1;
				sx = e.getX();
				sy = e.getY();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				isNew = 1;
				
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		// 이전에 그렸던 것들만 복구
		for(GraphicInfo g2: list) {
			g.setColor(g2.getDrawColor());
			int x = g2.getSx();
			int y = g2.getSy();
			int width = g2.getEx() - g2.getSx();
			int height = g2.getEy() - g2.getSy();
			if( g2.getSx() > g2.getEx()  ) {
				x = g2.getEx();
				width = g2.getSx() - g2.getEx();
			}

			if(g2.getSy() > g2.getEy()) {
				y = g2.getEy();
				height = g2.getSy() - g2.getEy();
			}

			switch(g2.getDrawType()) {
				case 0:g.drawLine(g2.getSx(), g2.getSy(), g2.getEx(), g2.getEy());break;
				case 1:g.drawRect(x, y, width, height);break;
				case 2:g.drawOval(x, y, width, height);break;
			}
		}
		// 새로 그려주는것만 따로 코딩
		int x = sx;
		int y = sy;
		int width = ex - sx;
		int height = ey - sy;
		if (sx > ex) {
			width = sx - ex;
			x = ex;
		}
		if (sy > ey) {
			height = sy - ey;
			y = ey;
		}

		if (drawType == 0) {
			g.drawLine(sx, sy, ex, ey);
		}
		if (drawType == 1) {
			g.drawRect(x, y, width, height);
		}
		if (drawType == 2) {
			g.drawOval(x, y, width, height);
		}
	}
}






