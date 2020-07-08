package com.bit.exam02;

public class Circle extends TwoDimenShape {
	private double radius;
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius; 
	}
	
	public String toString() {
		return super.toString() + ", 원의 반지름:" + radius + ", 면적:"+ area; 
	}
	
	@Override
	public double getArea() {
		area = radius * radius * 3.14;
		return area;
	}
}
