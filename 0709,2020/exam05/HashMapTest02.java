package com.bit.exam05;

import java.util.ArrayList;

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
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("�迵��", 40));
		list.add(new Person("��浿", 42));
		list.add(new Person("����", 3));
		
		System.out.println(list.get(0));
	}

}
