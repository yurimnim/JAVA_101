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

//person 객체를 매개변수로 전달받아 나이를 1 증가하는 메소드 정의 

public class CallByReferenceObject {
	public static void main(String[] args) {
	 Person ps = new Person("고길동", 40);
	 ps.plusOne();
	 
	 System.out.println(ps);
	}
}
