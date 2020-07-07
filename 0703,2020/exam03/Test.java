package com.bit.exam03;

class Shape {
	public Shape() {
		System.out.println("Shape 생성자");
	}
}

class Rectangle extends Shape {
	public Rectangle(){
		super(); // 무조건 첫번째 줄에 와야함 
		System.out.println("Rectangle 생성자");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
	
	}
}
