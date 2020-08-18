package com.bit.exam08;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JPanel;

class DoodleInfo implements Serializable{
	private int sx, sy, ex, ey;
	private int drawType;
	private Color colorType;
	
	public DoodleInfo(int sx, int sy, int ex, int ey, int drawType, Color colorType) {
		super();
		this.sx = sx;
		this.sy = sy;
		this.ex = ex;
		this.ey = ey;
		this.drawType = drawType;
		this.colorType = colorType;
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
	public Color getColorType() {
		return colorType;
	}
	public void setColorType(Color colorType) {
		this.colorType = colorType;
	}		
}


public class LinePanel extends JPanel {
	int sx, sy, ex, ey;
	int drawType;
	Color colorType;
	ArrayList<DoodleInfo> list;
	MyFrame f;
	
	public LinePanel(MyFrame f) {
		this.f = f;
		list = new ArrayList<DoodleInfo>();
		
		addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {
				ex = e.getX();
				ey = e.getY();
				list.add(new DoodleInfo(sx,sy,ex,ey,drawType,colorType));
				f.isNew = true;
				repaint();				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				sx = e.getX();
				sy = e.getY();
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
		for(DoodleInfo info:list) {
			g.setColor(info.getColorType());
			int x = info.getSx();
			int y = info.getSy();
			int width = info.getEx() - info.getSx();
			int height = info.getEy() - info.getSy();
		
			if(info.getSx() > info.getEx()) {
				x = info.getEx();
				width = info.getSx() - info.getEx();
			}
			if(info.getSy()> info.getEy()) {
				y = info.getEy();
				height = info.getSy()-info.getEy();
			}
			
			switch(info.getDrawType()) {
			case 0: g.drawLine(info.getSx(),info.getSy(), info.getEx(), info.getEy());break;
			case 1:	g.drawRect(x, y, width, height); break;
			case 2: g.drawOval(x, y, width, height); break;			
		}
	}

			
		
//		int width = ex - sx ;
//		int height = ey - sy;
//		int x = sx;
//		int y = sy;
//		
//		if(sx > ex) {
//			width = sx - ex;
//			x = ex;
//		}
//		if(sy > ey) {
//			height = sy - ey;
//			y = ey;
//		}
	//	g.drawOval(x, y, width, height);
//		g.drawRect(x, y, width, height);
		
//		for(DoodleInfo info:list) {
//			g.setColor(colorType);					
//			switch(info.getDrawType()) {
//				case 0: g.drawLine(sx, sy, ex, ey);break;
//				case 1:	g.drawRect(sx, sy, ex, ey); break;
//				case 2: g.drawOval(sx, sy, ex, ey); break;			
//			}
//		}

	}
	
}
