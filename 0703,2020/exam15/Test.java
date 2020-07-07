package com.bit.exam15;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

	@Override
	public String toString() {
		return " [이름=" + name + ", 나이=" + age + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("이순신",30);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
