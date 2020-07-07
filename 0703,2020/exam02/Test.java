package com.bit.exam02;

class Base {
	public Base() {
		System.out.println("Base 생성자");
	}
}

class Derived extends Base {
	public Derived() {
		super(); //이게 생략이 되어있는 상태 
		System.out.println("Derived 생성자");
	}
}

public class Test {
	public static void main(String[] args) {
		//Base b1= new Base();
		Derived d1 = new Derived();
	}
}
