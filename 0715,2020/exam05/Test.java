package com.bit.exam05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MyFrame extends JFrame {
	CrossPanel cp;
	public MyFrame() {
		cp = new CrossPanel();
		add(cp);
		JMenuBar jmb = new JMenuBar();
		JMenu mn_color = new JMenu("그리기색상");
		JMenuItem color_red = new JMenuItem("red"); 
		JMenuItem color_green = new JMenuItem("green"); 
		JMenuItem color_blue = new JMenuItem("blue"); 
		JMenuItem color_black = new JMenuItem("black"); 
		
		mn_color.add(color_red);
		mn_color.add(color_green);
		mn_color.add(color_blue);
		mn_color.add(color_black);
		
		jmb.add(mn_color);
		setJMenuBar(jmb);
		
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
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
