package com.bit.exam05;

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
}

//person ��ü�� �Ű������� ���޹޾� ���̸� 1 �����ϴ� �޼ҵ� ���� 

public class CallByReferenceObject {
	public static void plusOne(Object p) {
		((Person)p).age = ((Person)p).age + 1;
	}

	public static void main(String[] args) {
	 Person ps = new Person("��浿", 40);
	 plusOne(ps);
	 
	 System.out.println(ps);
	}
}
