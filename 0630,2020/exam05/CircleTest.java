package com.bit.exam05;

class Circle {
	private double radius;
	
	public Circle(){
		this(0); // int �� �� 
	}
	
	public Circle(double radius){
		this.radius = radius;
		System.out.println("������ 1�� ����");
	}
	
	public Circle(int radius){
		this.radius = radius;
		System.out.println("������ 2�� ����");
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();

	}

}
