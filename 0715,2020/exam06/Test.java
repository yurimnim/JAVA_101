package com.bit.exam06;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MyFrame extends JFrame {
	AllPanel cp;
	
	public MyFrame() {
		cp = new AllPanel();
		add(cp);
		JMenuBar jmb = new JMenuBar();			
		JMenu mn_color = new JMenu("그리기색상");
		JMenuItem color_red = new JMenuItem("red"); 
		JMenuItem color_green = new JMenuItem("green"); 
		JMenuItem color_blue = new JMenuItem("blue"); 
		JMenuItem color_black = new JMenuItem("black"); 
		
		JMenu mn_shape = new JMenu("그리기도구");
		JMenuItem shape_circle = new JMenuItem("원"); 
		JMenuItem shape_rec = new JMenuItem("사각형"); 
		JMenuItem shape_cross = new JMenuItem("대각선"); 
		
		mn_color.add(color_red);
		mn_color.add(color_green);
		mn_color.add(color_blue);
		mn_color.add(color_black);
		
		mn_shape.add(shape_circle);
		mn_shape.add(shape_rec);
		mn_shape.add(shape_cross);
		
		jmb.add(mn_color);
		jmb.add(mn_shape);
		setJMenuBar(jmb);
		
		shape_cross.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawType = 0;
				
			}
		});
		shape_rec.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawType = 1;
				
			}
		});
		shape_circle.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawType = 2;
			}
		});
		
		color_black.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawColor = Color.black;
			}
		});
		color_blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawColor = Color.blue;
				
			}
		});
		color_green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawColor = Color.green;
				
			}
		});
		color_red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cp.drawColor = Color.red;
				
			}
		});				
		setSize(400, 300);
		setVisible(true);		
	}
}

public class Test {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
