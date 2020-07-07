package com.bit.exam10;

abstract class Shape {
	int x;
	int y;
	double area;	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}	
	public abstract void calcArea();
}

class Rectangle extends Shape {
	double width; 
	double height;	

	
	public Rectangle(int x,int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
		calcArea();
	}
	public void calcArea() {
		area = width * height;
	}
}
//shape 을 확장한 삼각형 클라스 생성

class Triangle extends Shape {	
	double width;
	double height;
	public Triangle(int x, int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
		calcArea();
	}
	public void calcArea() {
		area = width * height * 1/2;
	}
}

class Circle extends Shape {
	double radius; 	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
		calcArea();
	}	
	public void calcArea() {
		area = radius * radius * 3.14;
	}
}

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10, 100, 100);
		Triangle t = new Triangle(10, 120, 100, 100);
		Circle c = new Circle(10, 240, 50);
		
//		r.calcArea();
//		t.calcArea();
//		c.calcArea();
		
		System.out.println("사각형의 면적 " + r.area);
		System.out.println("삼각형의 면적 " + t.area);
		System.out.println("원의 면적 " + c.area);
		
	}
}
