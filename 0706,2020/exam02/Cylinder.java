package com.bit.exam02;

public class Cylinder extends ThreeDimenShape {
	double height;
	double radius;

	public Cylinder(int x, int y, double radius, double height) {
		super(x, y);
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		volume = Math.pow(radius, 2)*Math.PI*height;
		return volume;
	}
	
	
	public String toString() {
		return super.toString() + ", 원기둥 반지름:" + radius + ", 높이:" + height + ", 부피:" + volume;
	}

}
