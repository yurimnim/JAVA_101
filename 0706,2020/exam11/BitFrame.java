package com.bit.exam11;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class BitFrame extends JFrame implements MouseListener, MouseMotionListener {
	
	public BitFrame() {
		setTitle("다중상속연습");
		setSize(400,300);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragged!");

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked!");

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
	

	}

	@Override
	public void mouseExited(MouseEvent e) {


	}

}
