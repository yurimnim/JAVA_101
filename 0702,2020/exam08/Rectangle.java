package com.bit.exam08;

import com.bit.exam07.Shape;

public class Rectangle extends Shape {
	int width;
	int height;
	
	public double calcArea() {
		return width* height;
	}
	public void draw() {
		System.out.println("(" + x + "," + y + ") 위치에 가로" + width + " 세로:" + height );
	}
	
	public void setWidth(int i) {
		// TODO Auto-generated method stub
		width = i;
	}
	
	public void setHeight(int i) {
		// TODO Auto-generated method stub
		height = i;
	}
	
}
	
	
	

