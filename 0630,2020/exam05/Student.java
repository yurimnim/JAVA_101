package com.bit.exam05;

public class Student {
	private String name;
	private String rollno;
	private int age;
	
	public Student(String name, String rollno, int age) {
		this.name = name; 
		this.rollno = rollno;
		this.age = age;	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Student t = new Student("Kim","20180001", 20);
		System.out.println("�̸�::" + t.getName() + "  �й�:::" + t.getRollno() + "  ����:::" + t.getAge());
	}
	
}
