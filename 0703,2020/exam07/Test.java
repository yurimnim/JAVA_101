package com.bit.exam07;

class Animal {
	public void eat() {
		System.out.println("������ �԰��ִ�");
	}
}

class Dog extends Animal {
	
	public void eat() {
		System.out.println("�������� �԰��ִ�");
	}
	
	public void pro() {
		super.eat(); //�θ�Ŭ������ �ִ� ������ �޼ҵ� �����ϴ� ��� 
	}
}

class Test {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.pro();
	}
}