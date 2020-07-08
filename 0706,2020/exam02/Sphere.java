package com.bit.exam02;

public class Sphere extends ThreeDimenShape {
	private double radius;
	
	public Sphere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public double getVolume() {
		//volume = radius * radius * radius * 4/3.0 * 3.14;
		volume = Math.pow(radius, 3) * 4/3.0 * Math.PI;
		return volume;
	}
	
	public String toString() {
		return super.toString() + ", �� ������:" + radius + ", ����:" + volume;
	}
	

}
