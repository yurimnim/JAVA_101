package com.bit.exam02;

class Base {
	public Base() {
		System.out.println("Base ������");
	}
}

class Derived extends Base {
	public Derived() {
		super(); //�̰� ������ �Ǿ��ִ� ���� 
		System.out.println("Derived ������");
	}
}

public class Test {
	public static void main(String[] args) {
		//Base b1= new Base();
		Derived d1 = new Derived();
	}
}
