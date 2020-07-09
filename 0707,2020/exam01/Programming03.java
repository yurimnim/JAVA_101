package com.bit.exam01;

//import java.util.Random;

interface Drawable{
	void draw();
}

class Shape3 {
	protected int x,y;

	public Shape3(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("Shape Draw\n");
	}
	public String toString() {
		return "기준점:"+"("+x+", "+y+")\n";
	}
}

class Rectangle3 extends Shape3 {
	int width, height;

	public Rectangle3(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	public String toString() {
		return super.toString()+"width="+width+"\nheight"+height;
	}
}

class Circle3 extends Shape3 {
	int radius;

	public Circle3(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle Draw");
	}
	public String toString() {
		return super.toString()+"radius="+radius;
	}
}

class Triangle3 extends Shape3 {
	int width;
	int height;
	public Triangle3(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
	public String toString() {
		return super.toString()+"width="+width+"\nheight"+height;
	}
}

public class Programming03 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3 mov[] = new Shape3[3];
		mov[0] = new Rectangle3(10, 20, 2, 3);
		mov[1] = new Circle3(10, 3, 3);
		mov[2] = new Triangle3(10, 5, 1, 4);
		
		for(int i=0;i<mov.length; i++) {
			((Drawable)mov[i]).draw();
		}
		
//		System.out.println("draw() 호출\nmov["+r+"]:");
//		mov[r].draw();
	}

}
