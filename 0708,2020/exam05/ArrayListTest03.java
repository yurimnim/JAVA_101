package com.bit.exam05;
import java.util.ArrayList;

class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void sayHello() {
		System.out.println(name + " says hello.");
	}
	
	@Override
	public String toString() {
		return "Name:" + name + ", Age:" + age;
	}
	
}

class Bird {
	String name;
	String color;
	
	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void fly() {
		System.out.println(color + " colored " + name + " is flying");
	}

	@Override
	public String toString() {
		return "Name:" + name + ", color:" + color;
	}		
}

public class ArrayListTest03 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("이순신",20));
		list.add(new Person("둘리",30));
		list.add(new Person("고길동",32));
		
		for(int i=0; i<list.size(); i++) {
			Person p = list.get(i);
			p.sayHello();
		}
		
	}
}

