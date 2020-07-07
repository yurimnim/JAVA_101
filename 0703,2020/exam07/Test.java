package com.bit.exam07;

class Animal {
	public void eat() {
		System.out.println("동물이 먹고있다");
	}
}

class Dog extends Animal {
	
	public void eat() {
		System.out.println("강아지가 먹고있다");
	}
	
	public void pro() {
		super.eat(); //부모클래스에 있는 동일한 메소드 접근하는 방식 
	}
}

class Test {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.pro();
	}
}