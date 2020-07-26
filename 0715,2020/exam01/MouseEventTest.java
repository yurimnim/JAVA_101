package com.bit.exam01;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(400,300);
		setVisible(true);
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ������");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("���콺 ������");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺 ����");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺 ����");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("���콺 Ŭ����");
			}
		});
	}
}

public class MouseEventTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
