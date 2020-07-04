package com.bit.exam04;

public class StringTest02 {
	
	public static void main(String[] args) {
		String data = "hello korea";
		String s1 = data.substring(0, 5);
		System.out.println(s1);
		String s3 = data.substring(6, 11);
		String s2 = data.substring(6);
		System.out.println(s2);
		System.out.println(s3);
	}

}
