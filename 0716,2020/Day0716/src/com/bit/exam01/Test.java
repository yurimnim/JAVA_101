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
		JMenu mn_file = new JMenu("파일");
		JMenu mn_draw = new JMenu("그리기 도구");
		JMenu mn_color = new JMenu("그리기 색상");
		
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");
		
		JMenuItem color_red = new JMenuItem("빨강");
		JMenuItem color_green = new JMenuItem("초록");
		JMenuItem color_blue = new JMenuItem("파랑");
		JMenuItem color_black = new JMenuItem("검정");
		JMenuItem color_more = new JMenuItem("다른색상...");
		
		
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
				int re = JOptionPane.showConfirmDialog(f, "저장하시겠습니까?");

					if (re == 0) {
						save();
					}
					if (re == 0 || re == 1) {
						lp.list.clear();
						lp.repaint();
						// 가장 마지막에 그린 graphics가 지워지지 않음.
						// 새파일을 연 후 마우스 클릭 한번 해야 지워짐
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
				jcc.showDialog(null, "그리기 색상", Color.black);
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
				System.out.println("예외발생:"+ex.getMessage());
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
				JOptionPane.showMessageDialog(null, "저장하였습니다.");
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
		}
	}
}


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("제목 없음");
	}
}
