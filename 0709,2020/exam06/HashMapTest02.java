package com.bit.exam06;

import java.util.HashMap;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "이름:" + name + ", 나이:" + age;
	}
}

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<String, Person> family = new HashMap<String, Person>();
		family.put("엄마", new Person("김영희", 40));
		family.put("아빠", new Person("고길동", 42));
		family.put("아들", new Person("고희동", 3));
		
		System.out.println(family.get("아들"));
		
	}

}
