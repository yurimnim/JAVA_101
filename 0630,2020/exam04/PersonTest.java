package com.bit.exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		//사용자가 생성자를 만들지 않으면 기본생성자를 제공하지만 
		//사용자가 생성자를 만들기 시작하면 더이상 기본생성자를 제공하지 않는다.
		
		System.out.println(p.getName()); //
		System.out.println("|" + p.getGender() + "|");
		System.out.println(p.getAge());
		
		if(p.getGender() == ' ') {
			System.out.println("빈칸입니다.");
		}else {
			System.out.println("빈칸이 아닙니다.");
		}
	}
}
