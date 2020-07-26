package com.bit.exam08;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class MyFrame extends JFrame {
	LinePanel lp;
	
	public MyFrame() {
		lp = new LinePanel();
		add(lp);
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm_draw = new JMenu("그리기 도구");
		JMenu jm_file = new JMenu("파일");
		
		JMenuItem draw_line = new JMenuItem("선그리기"); 
		JMenuItem draw_rect = new JMenuItem("사각형그리기"); 
		JMenuItem draw_circle = new JMenuItem("원그리기"); 
		
		JMenu jm_color = new JMenu("그리기 색상");
		JMenuItem color_red = new JMenuItem("빨강"); 
		JMenuItem color_blue = new JMenuItem("파랑"); 
		JMenuItem color_green = new JMenuItem("초록"); 
		JMenuItem color_black = new JMenuItem("검정");
		JMenuItem more_color = new JMenuItem("다른색상");
		
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		jm_draw.add(draw_line);
		jm_draw.add(draw_rect);
		jm_draw.add(draw_circle);
		
		jm_color.add(color_red);
		jm_color.add(color_blue);
		jm_color.add(color_green);
		jm_color.add(color_black);
		jm_color.add(more_color);
		
		jm_file.add(file_new);
		jm_file.add(file_open);
		jm_file.add(file_save);
		
		jmb.add(jm_file);
		jmb.add(jm_draw);
		jmb.add(jm_color);
		
		
		setJMenuBar(jmb);

		//모양변경 0:선 1:사각형 2:원
		draw_line.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 0;
			}
		});
		draw_rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 1;
			}
		});
		draw_circle.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 2;				
			}
		});
		
		//색깔추가
		color_red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.colorType = Color.red;
			}
		});		
		color_blue.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.colorType = Color.blue;
			}
		});		
		color_green.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.colorType = Color.green;				
			}
		});		
		color_black.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.colorType = Color.black;
			}
		});
		
		more_color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JColorChooser jcc = new JColorChooser(Color.black);
				jcc.showDialog(null, "그리기색상",  Color.black);
			}
		});
		
		//파일 
		
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/Mydata/my.pan"));
					lp.list = (ArrayList<DoodleInfo>) ois.readObject();
					lp.repaint();				
					ois.close();
					
				} catch (Exception e2) {
					System.out.println("예외발생" + e2.getMessage());
				}	
			}
		});
		
		file_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/Mydata/my.pan"));
					oos.writeObject(lp.list);
					oos.close();
					JOptionPane.showMessageDialog(null, "저장하였습니다.");
					
				} catch (Exception e2) {
					System.out.println("예외발생" + e2.getMessage());
				}				
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
}

public class Test {

	public static void main(String[] args) {
		new MyFrame();
	}
}
