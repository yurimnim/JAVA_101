package com.bit.exam05;

public class CallByValueTest {
	//정수형 변수 n을 매개변수로 전달받아 1증가하는 메소드
	public static void plusOne(int n) {
		n = n+1;
		System.out.println("n: " + n);
	} 
	
	public static void main(String[] args) {
		int age = 20;
		
		plusOne(age);
		System.out.println(age);
	}
}
