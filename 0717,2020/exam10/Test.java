package com.bit.exam10;

public class Test {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Person p1 = new Person("��浿", 5, bus);
		Person p2 = new Person("�Ѹ�", 4, bus);
		Person p3 = new Person("�����", 2, bus);
		p1.start();
		p2.start();
		p3.start();
		
	}

}
