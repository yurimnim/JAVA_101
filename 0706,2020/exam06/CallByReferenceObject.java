package com.bit.exam06;

class Person {
	String name;
	int age;
	
	public String toString() {
		return name + ", " + age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void plusOne() {
		age = age + 1;
	}
}

//person ��ü�� �Ű������� ���޹޾� ���̸� 1 �����ϴ� �޼ҵ� ���� 

public class CallByReferenceObject {
	public static void main(String[] args) {
	 Person ps = new Person("��浿", 40);
	 ps.plusOne();
	 
	 System.out.println(ps);
	}
}
