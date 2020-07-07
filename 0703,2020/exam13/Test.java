package com.bit.exam13;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/* 이것도 맞는 표현이긴 하나 오버라이딩이 아님 
	public boolean equals(Person p) {
		boolean r = false;
		if(name.equals(p.name) && age == p.age) {
			r = true;
		}	
		return r;
	}
}
*/
	
	public boolean equals(Object obj) {
		boolean r = false;
		Person p = (Person)obj;
		if(name.equals(p.name) && age == p.age) {
			r = true;
		}	
		return r;
	}
}

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("고길동",20);
		Person p2 = new Person("고길동",20);
		
		if(p1.equals(p2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}

}
