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
		String year = null;
		String month = null;
		String date = null;
		
		int i = 0;
		while (st.hasMoreTokens()){
			switch(i) {
				case 0: year = st.nextToken(); break;
				case 1: month = st.nextToken(); break;
				case 2: date = st.nextToken(); break;
			}
			i++;
		} 
	
		if( (year==null)|| (month==null)|| (date==null) ) {
			throw new IllegalArgumentException("전달된 문자열이 null입니다.");
		} else
			System.out.println("년, 월, 일 : "+year+", "+month+", "+date);
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		try {
			MyDate m = new MyDate("2020/07");
		} catch (IllegalArgumentException e) {
			System.out.println("예외발생 : "+e.getMessage());
		}
	}
}
