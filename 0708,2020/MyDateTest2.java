package com.bit.exam06;

import java.util.StringTokenizer;

// 오류발생

class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}
class MyDate {
	String year, month, date;
	
	public MyDate(String str) throws IllegalArgumentException {		
		StringTokenizer st = new StringTokenizer(str, "/");
		
		if(str == null)) {
			throw new IllegalArgumentException("전달된 문자열이 null입니다.");
		}
		year = st.nextToken();
		month = st.nextToken();
		date = st.nextToken();		
}

public class MyDateTest2 {

	public static void main(String[] args) {
		try {
			String data;
			MyDate m = new MyDate(data);
		} catch (IllegalArgumentException e) {
			System.out.println("예외발생 : "+e.getMessage());
		}
		


	}
}
