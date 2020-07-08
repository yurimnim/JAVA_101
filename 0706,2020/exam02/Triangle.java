package com.bit.exam02;

public class Triangle extends TwoDimenShape {
	private double width;
	private double height;
	
	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		area = height * width * 1/2;
		return area;
	}
	
	public String toString() {
		return super.toString() + ", 삼각형 가로:" +  width + ", 세로:" + height + ", 면적: " +area;
		
	}

}
