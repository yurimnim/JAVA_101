package com.bit.exam04;

public class Person {
	private String name;
	private char gender;
	private int age;
	
	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}	
}
