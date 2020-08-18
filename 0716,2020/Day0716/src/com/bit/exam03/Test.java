package com.bit.exam03;

class Person {
	private String name;	
	public Person(String name) {
		this.name = name;
	}
	public void sayHello() {
		for(int i =1; i<=10; i++) {
			System.out.println("안녕," + name);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
}


public class Test {
	 public static void main(String[] args) {
		Person p = new Person("고길동");
		Person p2 = new Person("둘리");
		p.sayHello();
		p2.sayHello();
	}
}
