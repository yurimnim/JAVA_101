package com.bit.exam14;

abstract class Shape {
	public abstract void draw();
}

class Rectangle extends Shape {
	public void pro_rect() {
		System.out.println("Pro rect 입니다");
	}
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Circle extends Shape{
	public void pro_circle() {
		System.out.println("pro circle입니다");
	}
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Triangle extends Shape {
	public void pro_tri() {
		System.out.println("pro tri입니다");
	}
	
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}

public class Test {
	public static void pro(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
//		Shape s;
//		s = new Circle();
//		s.draw();
//		
//		((Circle)s).pro_circle();
		
		Shape[] arr = new Shape[3];
		arr[0] = new Rectangle();
		arr[1] = new Circle();
		arr[2] = new Circle();
		
		for(Shape s : arr) {
			s.draw();
			if(s instanceof Rectangle) {
				//(Rectangle)s.pro_rect();
				((Rectangle)s).pro_rect();
			} else if(s instanceof Circle) {
				((Circle)s).pro_circle();
			} else {
				((Triangle)s).pro_tri();
			}
			System.out.println("============");
		}
		
		
//		Rectangle r = new Rectangle();
//		Circle c = new Circle();
//		Triangle t = new Triangle();
//		
//		pro(r);
//		pro(c);
//		pro(t);
	}

}
