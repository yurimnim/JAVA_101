package com.bit.exam09;

public class Child extends Person {

	@Override
	public void Print() {
		super.Print();
		System.out.println("자식클래스의 프린트메소드");
	}
	
}
