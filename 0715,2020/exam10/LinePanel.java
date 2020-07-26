package com.bit.exam10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JPanel;

class GraphicInfo implements Serializable{
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
	
	int sx, sy, ex, ey;
	int drawType=0; //0:선, 1:사각형, 2:원
	Color drawColor=Color.black;
	ArrayList<GraphicInfo> list;
	
	public LinePanel() {
		list = new ArrayList<GraphicInfo>();
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				ex = e.getX();
				ey = e.getY();
				list.add(new GraphicInfo(sx, sy, ex, ey, drawType, drawColor));
				repaint();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				sx = e.getX();
				sy = e.getY();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for(GraphicInfo info:list) {
			g.setColor(info.getDrawColor());
			int x = info.getSx();
			int y = info.getSy();
			int width = info.getEx() - info.getSx();
			int height = info.getEy() - info.getSy();
			if( info.getSx() > info.getEx()  ) {
				x = info.getEx();
				width = info.getSx() - info.getEx();
			}
			
			if(info.getSy() > info.getEy()) {
				y = info.getEy();
				height = info.getSy() - info.getEy();
			}
			
			switch(info.getDrawType()) {
				case 0:g.drawLine(info.getSx(), info.getSy(), info.getEx(), info.getEy());break;
				case 1:g.drawRect(x, y, width, height);break;
				case 2:g.drawOval(x, y, width, height);break;
			}
		}
	
		//g.drawLine(sx, sy, ex, ey);
//		int width = ex - sx;
//		int height = ey - sy;
//		int x = sx;
//		int y = sy;
//		
//		if(sx > ex) {
//			width = sx - ex;
//			x = ex;
//		}
//		
//		if(sy > ey) {
//			height = sy - ey;
//			y  = ey;
//		}
//		
//		
//		g.drawRect(x, y, width, height);
//		g.drawOval(x, y, width, height);
		
	}
	
}
