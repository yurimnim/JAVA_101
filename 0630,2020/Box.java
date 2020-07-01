package com.bit.exam01;

public class Box {
	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Box(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Box() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
