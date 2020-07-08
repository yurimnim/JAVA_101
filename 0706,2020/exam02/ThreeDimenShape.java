package com.bit.exam02;
import com.bit.exam01.Shape;

abstract class ThreeDimenShape extends Shape {
	protected double volume;
	public abstract double getVolume();

	public ThreeDimenShape(int x, int y) {
		super(x,y);
	}
	
	public String toString() {
		return super.toString() + ", »ïÂ÷¿ø µµÇü ";
	}
	
}
