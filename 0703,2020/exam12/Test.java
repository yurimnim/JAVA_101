package com.bit.exam12;

abstract class Shape {
	public abstract void draw();
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing triangle");
	}
}

public class Test {
	public static void pro(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		Shape s;
		s = new Triangle(); 
		s = new Circle();
		s = new Rectangle();
		
//		Rectangle r = new Rectangle();
//		Circle c = new Circle();
//		Triangle t = new Triangle();
//		
//		pro(r);
//		pro(c);
//		pro(t);
	}

}
