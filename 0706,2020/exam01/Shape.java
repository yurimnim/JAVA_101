package com.bit.exam01;

public class Shape {
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "도형의 위치:("+ x + ", " + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
