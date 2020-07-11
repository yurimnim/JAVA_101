package com.bit.exam04;

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
		ArrayList list = new ArrayList();
		list.add("bitcamp");
		list.add(200);
		list.add(new Person("ko", 20));
		list.add(new Bird("bird", "yellow"));
		list.add(true);
		
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			if(obj instanceof Person) {
				((Person)obj).sayHello();
			}else if(obj instanceof Bird) {
				((Bird)obj).fly();
			}
			System.out.println(obj);
			
		}
	}
}
