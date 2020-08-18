package com.bit.exam01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

class MyFrame extends JFrame{
	LinePanel lp;
	JFileChooser jfc;
	JFrame f;

	public MyFrame(String title)
	{
		super(title);
		f = this;
		jfc = new JFileChooser();
		lp = new LinePanel();
		add(lp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("����");
		JMenu mn_draw = new JMenu("�׸��� ����");
		JMenu mn_color = new JMenu("�׸��� ����");
		
		JMenuItem file_new = new JMenuItem("������");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		
		JMenuItem draw_line = new JMenuItem("��");
		JMenuItem draw_rect = new JMenuItem("�簢��");
		JMenuItem draw_oval = new JMenuItem("��");
		
		JMenuItem color_red = new JMenuItem("����");
		JMenuItem color_green = new JMenuItem("�ʷ�");
		JMenuItem color_blue = new JMenuItem("�Ķ�");
		JMenuItem color_black = new JMenuItem("����");
		JMenuItem color_more = new JMenuItem("�ٸ�����...");
		
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);
		mn_draw.add(draw_oval);
		
		mn_color.add(color_red);
		mn_color.add(color_green);
		mn_color.add(color_blue);
		mn_color.add(color_black);
		mn_color.add(color_more);
		
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);
		setJMenuBar(jmb);
		
		file_new.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int check = lp.isNew;

			if (check == 1) {
				int re = JOptionPane.showConfirmDialog(f, "�����Ͻðڽ��ϱ�?");

					if (re == 0) {
						save();
					}
					if (re == 0 || re == 1) {
						lp.list.clear();
						lp.repaint();
						// ���� �������� �׸� graphics�� �������� ����.
						// �������� �� �� ���콺 Ŭ�� �ѹ� �ؾ� ������
					}
				}
				lp.list.clear();
				lp.repaint();
			}
		});
		
		file_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		
		
		draw_line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 0;
			}
		});
		draw_rect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 1;
			}
		});
		draw_oval.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawType = 2;
			}
		});
		
		color_black.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.black;
			}
		});
		
		color_red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.red;
			}
		});
		color_green.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.green;
			}
		});
		
		color_blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lp.drawColor = Color.blue;
			}
		});
		
		color_more.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JColorChooser jcc = new JColorChooser(Color.black);
				jcc.showDialog(null, "�׸��� ����", Color.black);
			}
		});
		setSize(400, 300);
		setVisible(true);
	}

	private void open() {
		int re = jfc.showOpenDialog(f);

		if (re == 0) {
			File file = jfc.getSelectedFile();

			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getName()));
				lp.list =(ArrayList<GraphicInfo>) ois.readObject();
				setName(file.getName());
				lp.repaint();
			}catch (Exception ex) {
				System.out.println("���ܹ߻�:"+ex.getMessage());
			}
		}
	}

	private void save() {
		int re = jfc.showSaveDialog(f);

		if (re == 0) {
			File file = jfc.getSelectedFile();

			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getName()));
				oos.writeObject(lp.list);
				oos.close();
				setName(file.getName());
				JOptionPane.showMessageDialog(null, "�����Ͽ����ϴ�.");
			}catch (Exception ex) {
				System.out.println("���ܹ߻�:"+ex.getMessage());
			}
		}
	}
}


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("���� ����");
	}
}
