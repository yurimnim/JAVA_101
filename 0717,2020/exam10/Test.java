package com.bit.exam10;

public class Test {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Person p1 = new Person("고길동", 5, bus);
		Person p2 = new Person("둘리", 4, bus);
		Person p3 = new Person("도우너", 2, bus);
		p1.start();
		p2.start();
		p3.start();
		
	}

}
