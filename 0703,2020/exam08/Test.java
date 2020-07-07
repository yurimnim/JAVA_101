package com.bit.exam08;

class Parent {
	public void Print() {
		System.out.println("부모클래스의 프린트 메소드");
	}
}

class Child extends Parent {
	public void Print() {
		super.Print();
		System.out.println("자식클래스의 프린트 메소드");
	}
}

public class Test {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		//p1.Print();
		
		Child c1 = new Child();
		c1.Print();
	}
}
