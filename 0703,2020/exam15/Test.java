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
		return " [�̸�=" + name + ", ����=" + age + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("�̼���",30);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
