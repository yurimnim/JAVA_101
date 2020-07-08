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

//person 객체를 매개변수로 전달받아 나이를 1 증가하는 메소드 정의 

public class CallByReferenceObject {
	public static void plusOne(Object p) {
		((Person)p).age = ((Person)p).age + 1;
	}

	public static void main(String[] args) {
	 Person ps = new Person("고길동", 40);
	 plusOne(ps);
	 
	 System.out.println(ps);
	}
}
