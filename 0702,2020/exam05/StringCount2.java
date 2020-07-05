package com.bit.exam05;

import java.util.Scanner;

public class StringCount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int cnt = 0;
		
		System.out.print("문자열을 입력하세요 ==> ");
		str = sc.nextLine().trim();
		
		String []arr = str.split(" ");
			for(String s:arr) {
				if(s.equalsIgnoreCase("hello")) {
					cnt++;
				}
			}
		
		System.out.println(cnt);
	}
}