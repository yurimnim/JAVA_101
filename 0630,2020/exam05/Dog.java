package com.bit.exam05;

public class Dog {
	private String breed;
	private int age;
	private String color;
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	public Dog(String breed, int age, String color) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//method
	public void hungry() {
		System.out.println("hungry()");
	}
	
	public void barking() {
		System.out.println("barking()");
	}
	
	public void sleeping() {
		System.out.println("sleeping()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog yk = new Dog("york", 1, "Orange");
		System.out.println(yk);
		System.out.println(yk.toString());
		
		/*
		System.out.println(yk.getBreed());
		System.out.println(yk.getAge());
		System.out.println(yk.getColor());
		yk.hungry();
		yk.barking();
		yk.sleeping();
		*/
	}
}

