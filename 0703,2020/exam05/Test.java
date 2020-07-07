package com.bit.exam05;

class Shape {
	public Shape(String msg) {
		
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super("사각형"); 
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		System.out.println("성공");
	}
}
