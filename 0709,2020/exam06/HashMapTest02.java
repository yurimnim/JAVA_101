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
		return "�̸�:" + name + ", ����:" + age;
	}
}

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<String, Person> family = new HashMap<String, Person>();
		family.put("����", new Person("�迵��", 40));
		family.put("�ƺ�", new Person("��浿", 42));
		family.put("�Ƶ�", new Person("����", 3));
		
		System.out.println(family.get("�Ƶ�"));
		
	}

}
