package com.bit.exam06;

class Shape {
	protected int x;
	protected int y;
	
}

class Circle extends Shape {
	int radius;
	public Circle(int radius) {
		x = 100;
		y = 100;
		this.radius = radius;
	}
	
	public double calcArea() {
		return 3.14*radius*radius;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(10);
		System.out.println("�����߽� :(" + obj.x + "," + obj.y + ")");
		System.out.println("���Ǹ��� :" + obj.calcArea());
	}

}
