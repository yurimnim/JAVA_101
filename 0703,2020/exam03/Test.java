package com.bit.exam03;

class Shape {
	public Shape() {
		System.out.println("Shape ������");
	}
}

class Rectangle extends Shape {
	public Rectangle(){
		super(); // ������ ù��° �ٿ� �;��� 
		System.out.println("Rectangle ������");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
	
	}
}
