package com.bit.exam01;
import java.util.Random;

interface Movable{
	void move();
}

abstract class Shape2 implements Movable{
	protected int x, y;
	public  abstract void  draw();
	public String toString() {
		return "±‚¡ÿ¡°:"+"("+x+", "+y+")\n";				
	}
	public void move() {
	}	
}

class Rectangle2 extends Shape2 {
	int width;
	int height;
	public Rectangle2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public void draw() {	
	}	
	public void move() {
		Random rand = new Random();
		x = rand.nextInt(100);
		y = rand.nextInt(100);
	}
	public String toString() {
		return super.toString()
				+"width = "+width+"\nheight ="+height;
	}
}

class Circle2 extends Shape2 {
	int radius;
	public Circle2(int radius) {
		super();
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle Draw");
	}
	public void move() {
		Random rand = new Random();
		x = rand.nextInt(100);
		y = rand.nextInt(100);
	}
	public String toString() {
		return super.toString()+"radius="+radius;
	}
}

class Triangle extends Shape2 {
	int width;
	int height;
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("Triangle Draw");
	}
	public void move() {
		Random rand = new Random();
		x = rand.nextInt(100);
		y = rand.nextInt(100);
	}
	public String toString() {
		return super.toString()+"width="+width+"\nheight="+height;
	}
}

public class Programming02 {
	public static void main(String[] args) {
		Movable mov[] = new Shape2[3];
		mov[0] = new Rectangle2(1, 3);
		mov[1] = new Circle2(3);
		mov[2] = new Triangle(5, 4);
		mov[0].move();
		System.out.println("==========Rectangle============\n"+mov[0].toString());
		mov[1].move();
		System.out.println("==========Circle==============\n"+mov[1].toString());
		mov[2].move();
		System.out.println("==========Triangle==============\n"+mov[2].toString());
	}

}
