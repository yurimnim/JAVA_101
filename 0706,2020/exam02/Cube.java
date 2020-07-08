package com.bit.exam02;

public class Cube extends ThreeDimenShape {

	private double width;
	private double height;
	private double length;
	
	public Cube(int x, int y, double width, double height, double length) {
		super(x, y);
		this.height = height;
		this.width = width;
		this.length =length;
	}

	@Override
	public double getVolume() {
		volume = width * height * length;
		return volume;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 직육면체 가로:" + width + ", 세로:" +length + ", 높이:" + height + ", 부피:" + volume;
	}
}
