package com.bit.exam06;

class Animal {
	void eat() {
		System.out.println("�԰�����...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("¢������...");
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}
