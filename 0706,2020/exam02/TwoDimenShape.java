package com.bit.exam02;
import com.bit.exam01.Shape;

abstract class TwoDimenShape extends Shape {
	protected double area;
	
	public TwoDimenShape(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return super.toString() + ", ������ ���� ";
	}
	
	public abstract double getArea();

}
