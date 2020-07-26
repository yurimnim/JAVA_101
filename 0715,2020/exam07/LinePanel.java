package com.bit.exam07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

class GraphicInfo{
	private int x;
	private int y;
	private Color drawColor;
	private int check;
	
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
	public GraphicInfo(int x, int y, Color c, int check) {
		super();
		this.x = x;
		this.y = y;
		this.drawColor = c;
		this.check = check;
	}
	public GraphicInfo() {}
	
	public Color getdrawColor() {
		return drawColor;
	}
	public void drawColor(Color drawColor) {
		this.drawColor = drawColor;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	
	
}

public class LinePanel extends JPanel {
	int x = -100;
	int y = -100;
	Color drawColor;
	int check;
	ArrayList<GraphicInfo> list;
	
	public LinePanel() {

		list = new ArrayList<GraphicInfo>();

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				x = e.getX();
				y = e.getY();
				
				list.add(new GraphicInfo(x, y, drawColor, check));
				repaint();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
		
			for(GraphicInfo i : list) {
					g.setColor(i.getdrawColor());
					if(i.getCheck() == 0) {
					g.drawLine(i.getX()-5, i.getY()+5, i.getX()+5, i.getY()-5);
					}
				
				  else if (i.getCheck() == 1) {
						g.drawOval(i.getX(), i.getY(), 10, 10);				
				  }
				  else if (i.getCheck() == 2) {
						g.drawRect(i.getX(), i.getY(), 10, 10);
				  }
			}
	
	
	}
	

}
