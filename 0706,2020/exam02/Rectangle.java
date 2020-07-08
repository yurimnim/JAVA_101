package com.bit.exam02;

public class Rectangle extends TwoDimenShape {
	private double width;
	private double height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	public String toString() {
		return super.toString() + ", 사각형 가로:" +  width + ", 세로:" + height + ", 면적: " + area;
	}

	@Override
	public double getArea() {
		area = height * width;
		return area;
	}

}
