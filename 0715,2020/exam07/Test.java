package com.bit.exam07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MyFrame extends JFrame{
	GraphicInfo gr;
	LinePanel lp;
	
	public MyFrame() {
		lp = new LinePanel();
		gr = new GraphicInfo();
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("����");
		JMenuItem jmi01 = new JMenuItem("����");
		JMenuItem jmi02 = new JMenuItem("���");
		JMenuItem jmi03 = new JMenuItem("�ʷ�");
		JMenuItem jmi04 = new JMenuItem("����");
		
		jm.add(jmi01);
		jm.add(jmi02);
		jm.add(jmi03);
		jm.add(jmi04);
		jmb.add(jm);
		setJMenuBar(jmb);
		JMenu jm2 = new JMenu("�׸��⵵��");
		JMenuItem jmcross = new JMenuItem("�밢��");
		JMenuItem jmoval = new JMenuItem("��");
		JMenuItem jmrec = new JMenuItem("�簢��");
		
		jm2.add(jmcross);
		jm2.add(jmoval);
		jm2.add(jmrec);
		jmb.add(jm2);

	    add(lp, BorderLayout.CENTER);
		
	    lp.drawColor = Color.MAGENTA;
		setSize(400, 300);
		setVisible(true);
		
		jmi01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.red;
			}
		});
		jmi02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor =(Color.yellow);
			}
		});
		jmi03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor =(Color.green);
			}
		});
		jmi04.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor =(Color.black);
			}
		});
		jmcross.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.check = 0;
			}
		});
		jmoval.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.check = 1;
			}
		});
		jmrec.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.check = 2;
			}
		});
	}  
		
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyFrame();
		

	}

}
