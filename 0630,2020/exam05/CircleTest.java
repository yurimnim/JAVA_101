package com.bit.exam05;

class Circle {
	private double radius;
	
	public Circle(){
		this(0); // int 로 들어감 
	}
	
	public Circle(double radius){
		this.radius = radius;
		System.out.println("생성자 1번 동작");
	}
	
	public Circle(int radius){
		this.radius = radius;
		System.out.println("생성자 2번 동작");
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();

	}

}
