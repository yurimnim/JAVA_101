package com.bit.exam05;

class Circle2 {
	private double radius;
	
	public Circle2(){
		this(0); // int �� �� 
	}
	
	public Circle2(double radius){
		this.radius = radius;
		System.out.println("������ 1�� ����");
	}
	
}

public class CircleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c = new Circle2();

	}

}
