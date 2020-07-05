package com.bit.exam05;

public class indexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String email = "tiger@naver.co.kr";
			int a = email.indexOf(".");
			System.out.println(a);
			//int b = email.indexOf(a,email.length() -1);
			int b = email.lastIndexOf(".",11);
			System.out.println(b);
	}

}
