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
				System.out.println("마우스 릴리즈");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 눌러짐");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 나감");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 들어옴");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭됨");
			}
		});
	}
}

public class MouseEventTest {
	public static void main(String[] args) {
		new MyFrame();
	}

}
