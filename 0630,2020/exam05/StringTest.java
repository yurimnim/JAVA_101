package com.bit.exam05;

public class StringTest {
	public static void main(String[] args) {
		String s = new String("java"); // 이것이원칙
		String s2 = "java";
		String s3 = "java";
		String s4 = new String("java"); //생성 방법에 따라 메모리 저장공간 다름
		
		if(s.equals("java")) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
		/*
		if(s2==s3) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		*/
		
		/*
		System.out.println(s);
		System.out.println(s2);
		*/
		
		/*
		if (s==s4) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		*/
 }
}
