package com.bit.exam08;

class Parent {
	public void Print() {
		System.out.println("�θ�Ŭ������ ����Ʈ �޼ҵ�");
	}
}

class Child extends Parent {
	public void Print() {
		super.Print();
		System.out.println("�ڽ�Ŭ������ ����Ʈ �޼ҵ�");
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
